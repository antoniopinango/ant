package com.alfonso.ant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfonso.ant.client.NinjaClient;
import com.alfonso.ant.dto.Planet;
import com.alfonso.ant.service.PlanetService;


@Service
public class PlanetServiceImpl implements PlanetService {

	@Autowired
	private NinjaClient ninjaClient;

	@Override
	public List<Planet> getPlanetsByName(String name) {
		return ninjaClient.getPlanetsByName(name);
	}
}
