package com.myApp.rest.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
//Controller
@RestController
public class BasicAuthenticationController {
		
// Enhancing the service to return a Bean
 @GetMapping(path="/basicauth")
   public AuthenticationBean helloWorldBean() {
	// throw new RuntimeException("Some Error happended! contact Support at **-**");
    return new AuthenticationBean("You are authenticated");
   }
 
}
