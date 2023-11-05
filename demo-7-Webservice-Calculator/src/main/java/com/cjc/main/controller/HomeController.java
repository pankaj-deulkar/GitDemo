package com.cjc.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@GetMapping("/add/{a}/{b}")
	public int add(@PathVariable int a,@PathVariable int b)
	{   
		int c=a+b;
		
		return c;
		
	}
	
	@GetMapping("/sub/{a}/{b}")
	public int sub(@PathVariable int a,@PathVariable int b)
	{   
		int c=a-b;
		
		return c;
		
	}
	
	@GetMapping("/mul/{a}/{b}")
	public int mul(@PathVariable int a,@PathVariable int b)
	{   
		int c=a*b;
		
		return c;
		
	}
	@GetMapping("/div/{a}/{b}")
	public int div(@PathVariable int a,@PathVariable int b)
	{   
		int c=a/b;
		
		return c;
		
	}
	
	
	

}
