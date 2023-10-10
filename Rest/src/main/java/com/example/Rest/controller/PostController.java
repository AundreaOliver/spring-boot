package com.example.Rest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Rest.dao.Gadget;
import com.example.Rest.dao.GadgetRepo;

@RestController
public class PostController {

	@Autowired
	GadgetRepo gadgetRepo;
	
	@PostMapping("gadget")
	public Optional<Gadget> insertGadget(@RequestBody Gadget gagdet){
		gadgetRepo.save(gagdet);
		return gadgetRepo.findById(gagdet.getId());
	}
}
