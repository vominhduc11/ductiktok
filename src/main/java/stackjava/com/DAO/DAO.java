package stackjava.com.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import stackjava.com.enity.discover;
import stackjava.com.enity.link;
import stackjava.com.enity.posts;
import stackjava.com.enity.recAcc;
import stackjava.com.enity.user;
import stackjava.com.hibernate.util.HibernateUtil;
import stackjava.com.model.postUser;
import stackjava.com.model.userSearch;

public class DAO {
	private static SessionFactory sFactory = HibernateUtil.getFactory();

	public static List<stackjava.com.model.recAcc> findAllRecUser() {
		Session session = sFactory.openSession();
		Query query = session.createQuery("FROM recAcc");
		List<stackjava.com.model.recAcc> listUser = new ArrayList<>();
		@SuppressWarnings("unchecked")
		List<recAcc> users = query.getResultList();
		users.forEach(user -> listUser.add(
				new stackjava.com.model.recAcc(user.getId(), user.getUser().getName(), user.getUser().getNickname(),
						user.getUser().getAvatar(), user.getUser().getLikes(), user.getUser().getFollowers())));
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
		Query query = session.createQuery("FROM posts WHERE id > (SELECT count(id) FROM posts)-" + (count + 10)
				+ "and id <= (SELECT count(id) FROM posts)-" + count);
		@SuppressWarnings("unchecked")
		List<posts> posts = query.getResultList();
		posts.forEach(post -> {
			Random rd = new Random();
			List<stackjava.com.model.link> lLinks = new ArrayList<>();
			List<link> links = post.getLinks();
			links.forEach(link -> lLinks.add(new stackjava.com.model.link(link.getLink())));
			lPosts.add(rd.nextInt(lPosts.size() + 1),
					new stackjava.com.model.posts(post.getId(), post.getUser().getAvatar(), post.getVideo(),
							post.getUser().getName(), post.getUser().getNickname(), post.getContent(), post.getMusic(),
							post.getUser().getFollowers(), post.getUser().getLikes(), post.getUserLike(),
							post.getUserComment(), post.getUserShare(), lLinks));
		});
		session.close();
		return lPosts;
	}

	public static stackjava.com.model.user findUser(String name) {

		List<postUser> postUsers = new ArrayList<>();
		Session session = sFactory.openSession();
		Query query = session.createQuery("FROM user WHERE name='" + name + "'");
		user user = (user) query.getSingleResult();
		List<posts> posts = user.getPosts();
		posts.forEach(post ->{
			List<stackjava.com.model.link> links = new ArrayList<>();
			List<link> link1s = post.getLinks();
			link1s.forEach(link1 -> links.add(new stackjava.com.model.link(link1.getLink())));
			postUsers.add(new postUser(post.getVideo(), post.getContent(), links));
		});
		stackjava.com.model.user user1 = new stackjava.com.model.user(user.getId(), user.getAvatar(), user.getName(),
				user.getNickname(),user.getContent(), user.getFollowing(), user.getFollowers(), user.getLikes(), postUsers);
		session.close();
		return user1;
	}

	public static List<userSearch> findUserSearch(String name) {
		List<userSearch> userSearchs = new ArrayList<>();
		Session session = sFactory.openSession();
		Query query = session.createQuery("FROM user u WHERE name like '%"+ name +"%'").setMaxResults(5);
		@SuppressWarnings("unchecked")
		List<user> users = query.getResultList();
		users.forEach(user -> userSearchs.add(new userSearch(user.getAvatar(), user.getName(), user.getNickname())));
		// TODO Auto-generated method stub
		return userSearchs;
	}
}
