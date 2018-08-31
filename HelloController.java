package com.kaiya.springbootDemo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public Map sayHello(){
		List<String> lis=new ArrayList();
		Map map = new HashMap<String, String>();
		map.put("法号", "狼大师");
		int a =0;
		int b =1;
		int c=a+b;
		map.put("性别", "男");
		map.put("法号", "狼大师");
		String s=new String("dsad");
		System.out.print(s);
		lis.add(s);
		return map;
	}
}
