package com.alfonso.ant.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.RequestInterceptor;
import feign.RequestTemplate;

@Configuration
public class FeignClientConfiguration {

	@Value("${cityApi.key}")
	private String apiKey;

	@Bean
	public RequestInterceptor requestInterceptor() {
		return new RequestInterceptor() {
			@Override
			public void apply(RequestTemplate template) {
				template.header("X-Api-Key", apiKey);
			}
		};
	}
}
