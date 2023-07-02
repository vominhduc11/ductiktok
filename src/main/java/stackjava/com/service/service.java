package stackjava.com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import stackjava.com.DAO.DAO;
import stackjava.com.model.discover;
import stackjava.com.model.posts;
import stackjava.com.model.recAcc;
import stackjava.com.model.user;
import stackjava.com.model.userSearch;

@Service
public class service {
    public static List<recAcc> findAllRecUser() {
		return DAO.findAllRecUser();
	}
    public static List<discover> findAllDisc() {
    	return DAO.findAllDisc();
	}
    public static List<posts> findPosts(int count) {
		return DAO.findPosts(count);
	}
	public static user findUser(String name) {
		// TODO Auto-generated method stub
		return DAO.findUser(name);
	}
	public static List<userSearch> findUserSearch(String name) {
		// TODO Auto-generated method stub
		return DAO.findUserSearch(name);
	}
}
