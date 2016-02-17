package com.scs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("master")
public class MasterController {

	@RequestMapping(value="/main")
	public ModelAndView ScsMasterPage() {
	
		System.out.println("Inside master page..");
        return new ModelAndView("masterPage");
    }
	
}
