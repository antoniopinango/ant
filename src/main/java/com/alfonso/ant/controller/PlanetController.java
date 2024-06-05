package com.alfonso.ant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alfonso.ant.dto.Planet;

import com.alfonso.ant.service.PlanetService;

@RestController
@RequestMapping("ant/planet")
public class PlanetController {

	@Autowired
	PlanetService planetService;

	@GetMapping("/{name}")
	List<Planet> getPlanetsByName(@PathVariable("name") String name){
		return planetService.getPlanetsByName(name);
	}
}
