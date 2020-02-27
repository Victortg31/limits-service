package br.com.indra.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.indra.microservices.limitsservice.component.Configuration;
import br.com.indra.microservices.limitsservice.controller.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {

	//Lendo os valores que estão no properties
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLemitsFromConfigurations() {
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}
}
