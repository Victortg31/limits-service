package br.com.indra.microservices.limitsservice.component;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service") //passando meu pré fixo já declarado no properties
public class Configuration {
	
	//Precisa declarar variaveis para receber o valores que tem no properties
	private int maximum;
	private int minimum;
	
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	
	

}
