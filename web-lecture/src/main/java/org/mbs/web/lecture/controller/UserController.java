package org.mbs.web.lecture.controller;

import org.mbs.web.lecture.model.User;
import org.mbs.web.lecture.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	private static final AtomicInteger auto = new AtomicInteger(0);

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/list")
	public String toList(Model model) {
		List<User> users = Arrays.asList(
				new User(1L, "张三", 18),
				new User(2L, "李四", 20),
				new User(3L, "王五", 30)
		);
		model.addAttribute(users);
		System.out.println(auto.getAndIncrement());
		return "list";
	}
}
