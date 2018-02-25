package com.ssm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController extends BaseController {
	
	private Logger LOG = LoggerFactory.getLogger(getClass());
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index(Model model) {
		ModelAndView mav = new ModelAndView();  
		mav.addObject("hello", "spring");  
		mav.setViewName("index");  
		LOG.info("进入index");
		return mav;  
	}
}
