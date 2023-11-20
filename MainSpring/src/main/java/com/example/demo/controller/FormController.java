package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.FormEntity;
import com.example.demo.repository.FormRepo;

@RestController
public class FormController {

	@Autowired
	private FormRepo repo;
	
@PostMapping("/adddata")
	public FormEntity addContent (@RequestBody FormEntity data) {
	try {
	repo.save(data);
	return data;
		}catch(Exception e) {
	e.printStackTrace();
		}
	return null;
	}

@GetMapping("/getdata")
	public List <FormEntity>getdata(){
	try {
		return repo.findAll();
	}catch (Exception e) {
		e.printStackTrace();
	}
	return null;
   }

@PutMapping("/updatedata")
public FormEntity updateContent (@RequestBody FormEntity data) {
	try {
	repo.save(data);
	return data;
		}catch(Exception e) {
	e.printStackTrace();
		}
	return null;
	}


 @SuppressWarnings("deprecation")
 @DeleteMapping("/deletedata/{Id}")
	public String deletedata (@PathVariable int Id) {
	try{FormEntity data=repo.getOne(Id);
		repo.delete(data);
		return "Your Current Id Data's Are Deleted";
		
		}catch(Exception WHAT) {
			WHAT.printStackTrace();
		}
		return null;
   }
}
	

