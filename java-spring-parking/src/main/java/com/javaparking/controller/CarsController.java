package com.javaparking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaparking.model.Cars;
import com.javaparking.repository.CarsRepository;

@RestController
@RequestMapping("/api/v1/")
public class CarsController {
	
	@Autowired
	private CarsRepository carsRepository;

	@GetMapping("/getCars")
	public List<Cars> getAllCars(){
		return carsRepository.findAll();
	}
}
