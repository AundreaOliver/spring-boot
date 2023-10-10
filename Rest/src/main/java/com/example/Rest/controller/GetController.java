package com.example.Rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Rest.dao.Gadget;
import com.example.Rest.dao.GadgetRepo;

@RestController
public class GetController {
	
	@Autowired
	GadgetRepo gadgetRepo;
	
	@RequestMapping("/")
	public String home() {
		return "Hello Ac!";
	}
	
	@GetMapping("gadgets")		
	public List<Gadget> getGadgets(){
		return gadgetRepo.findAll();
	}
}
