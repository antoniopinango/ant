package com.alfonso.ant.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Planet {
	private  String name;
	private  Double mass;
	private  Double radius;
	private  Long period;
	private  Double semiEjeMayor;
	private  Double temperature;
	private  Double distanceLightYear;
	private  Long massStar;
	private  Long temperatureStar;

}
