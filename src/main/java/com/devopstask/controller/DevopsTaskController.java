package com.devopstask.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsTaskController {
	@GetMapping(path = "/getMsg")
	public String getMsg() {
		return "Hello sujananthini";
	}

}
