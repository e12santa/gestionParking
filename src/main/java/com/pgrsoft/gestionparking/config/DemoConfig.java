package com.pgrsoft.gestionparking.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {
	
	public DemoConfig() {
		System.out.println("clase DemoConfig instanciada!");
	}
	
	@Bean
	public String texto() {
		System.out.println("entramos en texto()");
		return "Soy un texto";
	}

}
