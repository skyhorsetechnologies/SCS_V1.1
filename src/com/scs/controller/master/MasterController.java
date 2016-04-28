package com.scs.controller.master;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.scs.model.master.MasterClientsBean;
import com.scs.service.MasterServiceInterface;

@RestController
@RequestMapping("master")
public class MasterController {

	@Autowired
	MasterServiceInterface ms;
	
	
	MasterClientsBean mb;
	
	@RequestMapping(value="/main.action")
	public ModelAndView ScsMasterPage() 
	{	
		ms.getMasterDetails(1001);
		System.out.println("Inside master page..");
        return new ModelAndView("masterPage");
    }
	
	@RequestMapping(value="/getMasterData",method=RequestMethod.GET)
	public String GetMasterData() {
	
		
		String val="MyProject";
		System.out.println("@@@@@@@@@@@@@@@@@@@@***********************#################");
		return val;
        		
    }
	
	
}
