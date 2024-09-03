package com.myrestful.webservices.mypack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@RequestMapping(method=RequestMethod.GET,path="/hello")
	public String sayHello()
	{
		return "Hello World..Welcome from API";
	}	
	@GetMapping(path="/hello-world-bean")
	public Hello hello()
	{
		String name="Guru";int id=6;
		Hello h=new Hello();
		h.setId(id);
		h.setMessage(name);
		return h;
	}
	@GetMapping(path="/hello/{name}")
	public Hello sayHelloByName(@PathVariable String name)
	{
		return new Hello(name);
	}
}
