package com.kaiya.springbootDemo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public Map sayHello(){
		Map map = new HashMap<String, String>();
		map.put("法号", "空虚大师");
		map.put("性别", "男");
		map.put("法号", "空虚大师");
		map.put("annotation","ccccccccccc");
		map.put("annotation","fffffffffff");
		map.put("性别", "男");
		map.put("法号", "空虚大师");
		map.put("annotation","ccccccccccc");
		map.put("法号", "空虚大师");
		map.put("性别", "男");
		map.put("法号", "空虚大师");
		map.put("annotation","aaaaaaaaaaaaa");
		map.put("annotation","ffffffffff");
		map.put("性别", "男");
		map.put("法号", "空虚大师");
		map.put("annotation","dddddddddddd");
		map.put("法号", "空虚大师");
		map.put("性别", "男");
		map.put("法号", "空虚大师");
		map.put("annotation","ddddddddddd");
		map.put("annotation","vvvvvvvvvv");
		map.put("性别", "男");
		map.put("法号", "空虚大师");
		map.put("annotation","bbbbbbb");
		return map;
	}
}
