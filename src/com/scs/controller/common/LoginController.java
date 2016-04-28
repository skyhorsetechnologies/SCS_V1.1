package com.scs.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("scs")
public class LoginController {
	@RequestMapping(value="/homepage2.action")
	public ModelAndView ScsMainpage(Model m,@RequestParam(name="uid") int myid,@RequestParam(name="name") String myname) {
		
		
		
		System.out.println("entering.."+myid+"=="+myname);
        return new ModelAndView("homepage");
    }

	
	
}
