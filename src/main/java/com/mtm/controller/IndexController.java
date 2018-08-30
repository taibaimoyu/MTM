package com.mtm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	@ResponseBody
	public String index(){
		return "hello world! whatever hello";
	}
	
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		return "hello worker"; 
	}
}
