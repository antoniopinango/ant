package com.alfonso.ant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfonso.ant.client.NinjaClient;
import com.alfonso.ant.dto.City;
import com.alfonso.ant.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private NinjaClient ninjaClient;


	@Override
	public List<City> getCityByName(String name) {
		return ninjaClient.getCityByName(name);
	}
}
