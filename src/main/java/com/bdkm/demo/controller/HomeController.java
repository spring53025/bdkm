package com.bdkm.demo.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	/**
	 * Create
	 * @return
	 */
	@GetMapping("/")
	public String index() {
		
		return "index";
	}
	
	@GetMapping(value="/hello", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String hello() {
		return "Hello World";
	}

}
