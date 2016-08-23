package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Hello控制器
@Controller
public class HelloController {

	//拦截/hello的请求
	@RequestMapping(value = "/hello")
	public String hello() {
			
		//返回字符串“hello”作为视图的名称
		return "hello";
	}
	
	//拦截/*请求
	@RequestMapping(value = "/*")
	public String other() {
		
		//返回字符串“other”作为视图的名称
		return "other";
	}
}

