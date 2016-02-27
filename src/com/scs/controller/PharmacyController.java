package com.scs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("pharmacy")
public class PharmacyController {
	@RequestMapping(value="/main.action")
	public ModelAndView ScsPharmacyPage() {
	
		System.out.println("Inside pharmacy page..");
        return new ModelAndView("pharmacyPage");
    }
}
