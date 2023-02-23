package com.tripgo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoronaGuidelinesController {
	@Value("${guidelines.oxygenLevels}")
	private String oxygenLevels;
	@Value("${guidelines.quarantine}")
	private String quarantine;
	@Value("${guidelines.liters}")
	private String liters;
	@Value("${guidelines.temparatureLevels}")
	private String temparatureLevels;
	
	@GetMapping("/guidelines")
	public String showCoronaGuidelines(Model model) {
		model.addAttribute("oxygenLevels", oxygenLevels);
		model.addAttribute("quarantine", quarantine);
		model.addAttribute("liters", liters);
		model.addAttribute("temparatureLevels", temparatureLevels);
		
		return "corona";
	}

}
