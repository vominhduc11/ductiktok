package stackjava.com.springmvc.restful.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import stackjava.com.model.discover;
import stackjava.com.model.posts;
import stackjava.com.model.recAcc;
import stackjava.com.service.service;

@RestController
public class testApi {

	@Autowired
	HttpServletRequest httpServletRequest;
	@Autowired
	HttpServletResponse httpServletResponse;

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

	@PostMapping(value = "/api/post")
	public ResponseEntity<person> ResponseEntity(@RequestBody String person) {
		System.out.println(person);
		Gson gson = new Gson();
		person person1 = gson.fromJson(person, person.class);
		return new ResponseEntity<>(person1, HttpStatus.OK);
	}
}
