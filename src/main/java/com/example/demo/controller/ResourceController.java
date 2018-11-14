package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Resource;

@RestController
public class ResourceController {
	
	@Autowired
	private Resource resource;

	@RequestMapping("hello/getResource")
	public Resource getResource() {
		Resource bean =new Resource();
		bean.setName(resource.getName());
		bean.setWebsite(resource.getWebsite());
		bean.setLanguage(resource.getLanguage());
		System.err.println(bean.toString());
		return bean;
	}
}
