package com.example.microservicioActuator.endpoints;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestControllerEndpoint(id = "customEndpoint")
public class CustomEndpoint {
	
	
	@GetMapping("/random")
	public ResponseEntity<String> customEndpoint()
	{
		return new ResponseEntity<>("algo random", HttpStatus.OK);
	}

}
