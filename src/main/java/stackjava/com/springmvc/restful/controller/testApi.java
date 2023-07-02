package stackjava.com.springmvc.restful.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import stackjava.com.model.discover;
import stackjava.com.model.posts;
import stackjava.com.model.recAcc;
import stackjava.com.model.user;
import stackjava.com.service.service;
import stackjava.com.model.userSearch;

@RestController
public class testApi {

	@GetMapping(value = "/api/recAcc")
	public ResponseEntity<List<recAcc>> recUser() {
		return new ResponseEntity<>(service.findAllRecUser(), HttpStatus.OK);
	}

	@GetMapping(value = "/api/discover")
	public ResponseEntity<List<discover>> disc() {
		return new ResponseEntity<>(service.findAllDisc(), HttpStatus.OK);
	}

	@GetMapping(value = "/api/posts")
	public ResponseEntity<List<posts>> posts(@RequestParam("q") int count) {
		return new ResponseEntity<>(service.findPosts(count), HttpStatus.OK);
	}
	
	@GetMapping(value = "/api/user")
	public ResponseEntity<user> user(@RequestParam("q") String name) {
		return new ResponseEntity<>(service.findUser(name), HttpStatus.OK);
	}
	@GetMapping(value = "/api/userSearch")
	public ResponseEntity<List<userSearch>> userSearch(@RequestParam("q") String name) {
		return new ResponseEntity<>(service.findUserSearch(name), HttpStatus.OK);
	}
}
