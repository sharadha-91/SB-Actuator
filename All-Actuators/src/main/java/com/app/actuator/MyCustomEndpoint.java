package com.app.actuator;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="myend", enableByDefault = true)
public class MyCustomEndpoint {
	
	
	@ReadOperation
	public MyCustomEndPointResponse features() {
		return new MyCustomEndPointResponse(22, "Java-Spring Boot", "active");
	}
	
	@WriteOperation
    public MyCustomEndPointResponse updateFeatures(String message, String status) {
	 MyCustomEndPointResponse res = new MyCustomEndPointResponse(10, message,status);			
        res.setMessage(message);
        res.setStatus(status);
        System.out.println("response  >>>  " + res);
        return res;
    }

    @DeleteOperation
    public String deleteFeature() {
    	 MyCustomEndPointResponse r = new MyCustomEndPointResponse();
        r = null;
        return "Custom endpoint data has been deleted.";
    }
	
	
	

}
