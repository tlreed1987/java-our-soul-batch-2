package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping(path="/greet", method=RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("name","Nitin");
		return "details";
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String sayHello() {
		
		return "index";
	}
}
