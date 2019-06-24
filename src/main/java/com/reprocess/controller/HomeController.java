package com.reprocess.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.reprocess.enums.Pages;
import com.reprocess.enums.ProcessType;
import com.reprocess.forms.ReprocessFileForm;

@Controller
public class HomeController {
	private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

	@Value("${prod.username}")
	private String userName;

	@Value("${prod.password}")
	private String password;

	/**
	 * 
	 * @param modelAndView
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView modelView = new ModelAndView();
		List<ProcessType> fileTypes = ProcessType.getAll();
		modelView.addObject("ReprocessFileForm", new ReprocessFileForm());
		modelView.addObject("fileTypes", fileTypes);
		modelView.setViewName(Pages.homepage.name());
		return modelView;

	}

	@RequestMapping(value = "/processFile", method = RequestMethod.POST)
	public ModelAndView addVisit(@ModelAttribute("ReprocessFileForm") ReprocessFileForm reprocessFileForm,
			BindingResult result) throws NullPointerException {
		ModelAndView model = new ModelAndView();
		try {
			LOGGER.info("ReprocessFileForm: {}", reprocessFileForm);
			// TODO: integrate selenium code here
			
		} catch (Exception e) {
			LOGGER.error("Errors while processing: {}", e.getMessage());
		}
		model.setViewName(Pages.homepage.name());
		return model;
	}

}