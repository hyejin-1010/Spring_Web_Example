package com.hyepago.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hello.do")
	public String sayHello() {
		return "helloView";
	}
}