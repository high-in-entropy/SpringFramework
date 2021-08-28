package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("<>") can be used atop the class too. in that case this url will form the
//base to the urls defined in methods down below.
@RequestMapping("/")
public class HomeController {
	
	
	/*
	 * Add the address suffix here. For example if you need an about.jsp page, add
	 * /about and return "about" form the about method. the ViewController we
	 * declared in config.xml will take care of amending the URL path with suffix
	 * and prefix(=.jsp). So in short, everytime you wanna create a new page, just
	 * add its method here and create the display (or view in MVC terms) in views folder.
	 */ 
	
	@RequestMapping("/")
	public String home(Model model) {
		System.out.println("this is home method in Controller");
		model.addAttribute("Name", "Viraj Mohile");
		return "index";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("We are inside help controller! This is ModelAndView "
				+ "way of bringing model to the view.");
		ModelAndView model = new ModelAndView();
		//If we make the page name the same as requestmapping name, no need of setViewName
		model.setViewName("help1");
		model.addObject("name","Viraj Mohile is here to help");
		return model;
		
	}
	//The method by which model is retrieved from the view by the controller.
	@RequestMapping(path = "/register", method = RequestMethod.GET)
	public String register() {
		return "register";
	}
	

}
