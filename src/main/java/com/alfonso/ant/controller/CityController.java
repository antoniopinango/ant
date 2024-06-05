package com.alfonso.ant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alfonso.ant.dto.City;
import com.alfonso.ant.service.CityService;

@RestController
@RequestMapping("ant/city")
public class CityController {

	@Autowired
	CityService cityService;

	@GetMapping("/{name}")
	List<City> getCityByName(@PathVariable("name") String name){
		return cityService.getCityByName(name);
	}
}
