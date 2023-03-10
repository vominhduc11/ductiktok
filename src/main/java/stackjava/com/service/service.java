package stackjava.com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import stackjava.com.DAO.DAO;
import stackjava.com.model.discover;
import stackjava.com.model.posts;
import stackjava.com.model.recAcc;

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
}
