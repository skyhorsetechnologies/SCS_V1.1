package com.scs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.scs.security.HashcoderMain;
import com.scs.security.ScsAuthenticationFilter;

@Controller
@RequestMapping(value="/")
public class MainController {

	ScsAuthenticationFilter obj;
	@Autowired
	HashcoderMain hc;
	@RequestMapping(value="/homepage")
	public ModelAndView ScsMainpage(Model m) {		
		System.out.println("entering..Main");
		String val="12345";
		//int n=obj.hashCode();
		//System.out.println(n);
		String psswd=hc.getHashPassword(val);
		return new ModelAndView("homepage");
    }
	@RequestMapping("/login")
	public ModelAndView getLoginForm(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout,@RequestParam(value = "sess", required = false) String sess) {

		
		
		
		String message = "";
		if (error != null) {
			message = "Incorrect username or password !";
		} else if (logout != null) {
			
			message = "Logout successful..Thank you !";
		}
		else if (sess != null) {
			
			message = "Sorry Session expired !";
		}
		
		return new ModelAndView("loginPage", "message", message);
	}

/*	@RequestMapping(value="/logout")
	public ModelAndView ScsLogoutPage() {
	
		System.out.println("Logging out..");
        return new ModelAndView("logoutSuccessfulPage");
    }*/
	@RequestMapping(value="/logoutSuccessful")
	public ModelAndView ScsLogoutSuccessPage() {
	
		System.out.println("Logging out..");
        return new ModelAndView("logoutSuccessfulPage1");
    }
	@RequestMapping(value="/403")
	public ModelAndView ScsErrorPage() {
	
		System.out.println("Logging out..");
        return new ModelAndView("403");
    }
	
	
	
}
