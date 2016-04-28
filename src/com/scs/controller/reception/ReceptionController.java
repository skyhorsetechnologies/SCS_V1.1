package com.scs.controller.reception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("reception")
public class ReceptionController {
	@RequestMapping(value="/main.action")
	public ModelAndView ScsReceptionPage() {
	
		System.out.println("Inside reception page..");
        return new ModelAndView("receptionPage");
    }
}
