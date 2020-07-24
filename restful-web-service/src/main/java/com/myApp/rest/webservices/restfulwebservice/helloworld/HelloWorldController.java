package com.myApp.rest.webservices.restfulwebservice.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
// @CrossOrigin(origins = "*", allowedHeaders = "*")
//Controller
@RestController
public class HelloWorldController {
	//GET
	//URI - /hello-world
	//Method - "Hello World
	@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	public String helloWorld() {
		return "Hello world !";
	}
	
// Enhancing the service to return a Bean
 @GetMapping(path="/hello-world-bean")
   public HelloWorldBean helloWorldBean() {
	// throw new RuntimeException("Some Error happended! contact Support at **-**");
    return new HelloWorldBean("Hello world Bean !");
   }
 // use path_variable /hello-world/path-variable/cola
 @GetMapping(path="/hello-world/path-variable/{name}")
 public HelloWorldBean helloWorldPathVarible(@PathVariable String name) {
 return new HelloWorldBean(String.format("Hello world, %s",name));
 }
}
