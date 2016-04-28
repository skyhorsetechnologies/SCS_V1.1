package com.scs.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("public")
public class PublicController {
	@RequestMapping(value="/main.action")
	public ModelAndView ScsDoctorPage() {
	
		System.out.println("Inside public page..");
        return new ModelAndView("publicPage");
    }
}
