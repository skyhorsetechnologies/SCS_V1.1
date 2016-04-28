package com.scs.controller.doctor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("doctor")
public class DoctorController {
	@RequestMapping(value="/main.action")
	public ModelAndView ScsDoctorPage() {
	
		System.out.println("Inside doctor page..");
        return new ModelAndView("doctorPage");
    }
}
