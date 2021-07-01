package com.example.userRegn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.userRegn.dao.UserRepository;
import com.example.userRegn.entity.User;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepo;
	@GetMapping("/")
public String home() {
	return "index";
}
	@GetMapping("/register")
	public String signup(Model model) {
		model.addAttribute("user", new User());
		return "signup_form";
	}
	@PostMapping("/process_register")
	public String registration(User user) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String encodedPassword=encoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		userRepo.save(user);
		return "register_success";
	}
	@GetMapping("/list_users")
	public String allUsers(Model m) {
		List<User> lists=userRepo.findAll();
		m.addAttribute("listUsers", lists);
		return "users";
	}
}
