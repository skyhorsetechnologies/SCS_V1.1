package com.scs.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("admin")
public class AdminController {
	@RequestMapping(value="/main.action")
	public ModelAndView ScsMasterPage() {
	   
		System.out.println("Inside admin page..");
        return new ModelAndView("adminPage");
    }
}
