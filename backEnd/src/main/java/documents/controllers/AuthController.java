package documents.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import documents.domainmodel.Role;
import documents.domainmodel.User;
import documents.services.UserService;

@Controller
public class AuthController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String login() {
		return "auth/signin";
	}
	
	@RequestMapping("/register")
	public String register(Model model) {
		User user = new User(Role.USER);
		 model.addAttribute("user", user);
		return "auth/signup";
	}
	
	@RequestMapping("/save")
	public String registerUser(@ModelAttribute("user") User user, Model model) {
		if(userService.isUserPresent(user)) {
			User user1 = new User(Role.USER);
			model.addAttribute("user", user1);
			model.addAttribute("successMessage", "User already exists");
			return "auth/signup";
		}
		else if(user.getPassword().length() == 0 || user.getUsername().length() == 0) {
			User user1 = new User(Role.USER);
			model.addAttribute("user", user1);
			model.addAttribute("successMessage", "Username and/or password is empty. Please provide again");
			return "auth/signup";
		}
		
		userService.saveUser(user);
		return "homepage";
	}
	
	@RequestMapping("/cancelSignup")
	public String cancelSignup() {
		return "redirect:/homepage";
	}
}
