package com.reprocess.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.reprocess.enums.Pages;
import com.reprocess.forms.ReprocessFileForm;


@Controller
public class HomeController {
	private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);


	/**
	 * Returns login page
	 * @param modelAndView
	 * @return
	 */
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName(Pages.login.name());
		return modelView;
	}

	/**
	 * 
	 * @param modelAndView
	 * @return
	 */
	@RequestMapping(value = "/homepage", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView modelView = new ModelAndView();
		List<String> fileTypes = new ArrayList<>();
		fileTypes.add("Test1");
		fileTypes.add("Test2");
		modelView.addObject("ReprocessFileForm", new ReprocessFileForm());
		modelView.addObject("fileTypes", fileTypes);
		modelView.setViewName(Pages.homepage.name());
		return modelView;

	}

}