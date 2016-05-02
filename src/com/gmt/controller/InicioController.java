package com.gmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gmt.service.PaisService;

@RequestMapping("/")
@Controller
public class InicioController {

	@Autowired
	private PaisService paisService;
	
	@RequestMapping("/")
	public ModelAndView inicio(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Gianmarco Malex Trillo");
		mav.addObject("paises",paisService.listPais());
		mav.setViewName("index");
		System.out.println(mav.toString());
		return mav;
	}
	
}
