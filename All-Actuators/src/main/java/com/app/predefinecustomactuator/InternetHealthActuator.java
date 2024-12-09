package com.app.predefinecustomactuator;

import java.net.URL;
import java.net.URLConnection;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class InternetHealthActuator implements HealthIndicator{

	@Override
	public Health health() {
	   return checkInternet() == true ?Health.up().withDetail("Success", "Active").build() : Health.down().withDetail("Error", "Inactive").build();				
	}

	public boolean checkInternet() {
		boolean flag = false;
		
		try {
			URL url = new URL("https://google.com");
			URLConnection connection = url.openConnection();
			connection.connect();
			flag = true;
			
		}catch(Exception e) {
			flag = false;
		}
		return flag;
	}
	
}
