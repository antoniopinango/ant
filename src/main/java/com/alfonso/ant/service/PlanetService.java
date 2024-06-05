package com.alfonso.ant.service;

import java.util.List;

import com.alfonso.ant.dto.Planet;

public interface PlanetService {

	List<Planet> getPlanetsByName(String name);
}
