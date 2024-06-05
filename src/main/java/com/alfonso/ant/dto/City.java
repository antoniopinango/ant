package com.alfonso.ant.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class City {

	private String name;
	private Double latitude;
	private Double longitude;
	private String country;
	private Long population;
	private boolean capital;

}
