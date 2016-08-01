package com.rquest.conservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rquest.conservice.DubboService;

@Service
public class DubboServiceImpl implements DubboService{
	
	@Autowired
	private com.rquest.service.DubboService dubboService;
	@Override
	public void sayHello(String username) {
		dubboService.sayHello("tomcat");
	}
	
}
