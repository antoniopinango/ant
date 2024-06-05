package com.alfonso.ant.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.alfonso.ant.dto.City;
import com.alfonso.ant.dto.Planet;

@FeignClient(name = "ninjaApi", url = "${ninjaApi.endPoint}")
public interface NinjaClient {

	@GetMapping(value = "city?name={name}")
	List<City> getCityByName(@PathVariable("name") String name);

	@GetMapping(value = "planets?name={name}")
	List<Planet> getPlanetsByName(@PathVariable("name") String name);

}
