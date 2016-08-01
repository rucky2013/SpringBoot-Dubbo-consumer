package com.rquest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rquest.conservice.DubboService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DubboApplication.class)
public class DubboApplicationTests {
	
	@Autowired
	private DubboService dubboService;
	
	@Test
	public void testDubbo(){
		dubboService.sayHello("baiguomin");
	}
}
