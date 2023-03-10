package stackjava.com.springmvc.restful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testui {
//	@RequestMapping("/ui")
//	public String ui() {
////		System.out.println("abc");
//		return "index";
//	}

	@RequestMapping("/giaodien")
	private String ui() {
		// TODO Auto-generated method stub
		return "index";
	}
}
