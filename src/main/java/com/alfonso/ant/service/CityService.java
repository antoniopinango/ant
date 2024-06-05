package com.alfonso.ant.service;

import java.util.List;

import com.alfonso.ant.dto.City;

public interface CityService {
	List<City> getCityByName(String name);
}
