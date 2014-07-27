package com.gea.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gea.domain.User;
import com.gea.services.WelcomeServices;

@Controller
public class WelcomeController {
	
	@Autowired
	private WelcomeServices services;

	@RequestMapping(value="/userIndex.html",method = RequestMethod.GET )
	public ModelAndView userIndex(HttpServletRequest req,HttpServletResponse res){
		ModelAndView model = new ModelAndView();
		System.out.println("userIndex :");
		services.processRequest();
		model.getModelMap().addAttribute("user", new User());
		model.setViewName("userIndex");
		return model;
	}
	
	@RequestMapping(value="/ViewForm.html",method = RequestMethod.GET )
	public ModelAndView viewForm(HttpServletRequest req,HttpServletResponse res){
		ModelAndView model = new ModelAndView();
		System.out.println("Process :");
		services.processRequest2();
		model.setViewName("viewForm");
		return model;
		
	}
	
	
	
	
}
