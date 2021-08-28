package springmvc.controller;

import org.springframework.context.ApplicationContext;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import springmvc.config.SpringContext;
import springmvc.dao.UserDao;
import springmvc.entities.User;

@Controller
public class RequestHandler {
	
	@RequestMapping("/register")
	public String register() {
		return "registers";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	/*
	 * @RequestMapping(path ="/processForm", method=RequestMethod.POST) public
	 * String registrationFormHandler(
	 * 
	 * @RequestParam("userEmail") String userEmail,
	 * 
	 * @RequestParam("userName") String userName,
	 * 
	 * @RequestParam("userPassword") String userPassword, Model model) {
	 * 
	 * System.out.println(userEmail); System.out.println(userPassword);
	 * System.out.println(userName); model.addAttribute("Success", userName +
	 * " successfully registered!"); return "register"; }
	 */
	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String RegistrationFormHandler(@ModelAttribute User user, Model model) {
		System.out.println(user);
		/*
		 * UserDao userDao = new UserDao(); int insert = userDao.insert(user);
		 */
		/*
		 * @SuppressWarnings("resource") ApplicationContext context = new
		 * AnnotationConfigApplicationContext(SpringConfig.class);
		 */
		SpringContext springContext = new SpringContext();
		
		ApplicationContext context = springContext.getContext();
		UserDao bean = context.getBean("getUserDao", UserDao.class);
		int insert = bean.insert(user);
		System.out.println(insert);
		return "register";
	}
	
	@RequestMapping(path = "/loginForm", method = RequestMethod.POST)
	public String loginForm() {
		
		
		System.out.println("Successfully logged in!");
		return "login";
	}

}
