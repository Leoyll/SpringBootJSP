package com.leo.controller;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//can not be @RestController
@Controller
//the following annotation is used to auto-config class attributes via application.properties or application.yml
//and the prefix is "home" in application.properties or application.yml
@ConfigurationProperties(prefix = "home")
public class HomeController {
    private String message;
    
    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message1", this.message);	//deliver attribute this.message to ${message1} in home.jsp
        return "/home";		// same as "home"
    }
    
    @RequestMapping("/hello")
    public String welcome2(Model model) {
        model.addAttribute("message1", this.message);	//similar as above method
        return "home";
    }

    //the following methods should be implemented to ensure the annotation of @ConfigurationProperties
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}  
    
}
