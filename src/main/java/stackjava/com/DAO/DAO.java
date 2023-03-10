package stackjava.com.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import stackjava.com.enity.discover;
import stackjava.com.enity.link;
import stackjava.com.enity.posts;
import stackjava.com.enity.recAcc;
import stackjava.com.hibernate.util.HibernateUtil;

public class DAO {
	private static SessionFactory sFactory = HibernateUtil.getFactory();

	public static List<stackjava.com.model.recAcc> findAllRecUser() {
		Session session = sFactory.openSession();
		Query query = session.createQuery("FROM recAcc");
		List<stackjava.com.model.recAcc> listUser = new ArrayList<>();
		@SuppressWarnings("unchecked")
		List<recAcc> users = query.getResultList();
		users.forEach(user -> listUser.add(new stackjava.com.model.recAcc(user.getId(), user.getName(),
				user.getNickname(), user.getAvatar(), user.getLike(), user.getFollow())));
		session.close();
		return listUser;
	}

	public static List<stackjava.com.model.discover> findAllDisc() {
		Session session = sFactory.openSession();
		Query query = session.createQuery("FROM discover");
		List<stackjava.com.model.discover> listDisc = new ArrayList<>();
		@SuppressWarnings("unchecked")
		List<discover> discovers = query.getResultList();
		discovers.forEach(discover -> listDisc
				.add(new stackjava.com.model.discover(discover.getId(), discover.getContent(), discover.getIsMusic())));
		session.close();
		return listDisc;
	}

	public static List<stackjava.com.model.posts> findPosts(int count) {
		List<stackjava.com.model.posts> lPosts = new ArrayList<>();
		Session session = sFactory.openSession();
		Query query = session.createQuery("FROM posts WHERE id >="+count+"and id<"+(count+10));
		@SuppressWarnings("unchecked")
		List<posts> posts = query.getResultList();
		posts.forEach(post -> {
			List<stackjava.com.model.link> lLinks = new ArrayList<>(); 
			List<link> links = post.getLinks();
			links.forEach(link -> lLinks.add(new stackjava.com.model.link(link.getId(), link.getLink())));
			lPosts.add(new stackjava.com.model.posts(post.getId(), post.getAvatar(), post.getVideo(), post.getName(),
					post.getSubname(), post.getContent(), post.getMusic(), post.getFollowers(), post.getLikes(),
					post.getUserLike(), post.getUserComment(), post.getUserShare(), lLinks));
		});
		session.close();
		return lPosts;
	}
}
