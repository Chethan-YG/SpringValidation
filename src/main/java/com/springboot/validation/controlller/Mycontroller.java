package com.springboot.validation.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.validation.entities.loginData;

import jakarta.validation.Valid;

@Controller
public class Mycontroller {
	
	
	@GetMapping("/form")
	public String form(Model model)
	{
		model.addAttribute("loginData", new loginData());
		return "form";
	}

	@PostMapping("/submit")
	public String processForm(@Valid @ModelAttribute("loginData") loginData loginData, BindingResult result)
	{
		if(result.hasErrors())
		{
			System.out.println(result);
			return "form";
		}
		System.out.println(loginData);
		return "success";
	}

}
