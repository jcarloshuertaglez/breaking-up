package com.example.demo;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@InjectMocks
	HelloWorld helloWorld;
	
	
	@Test
	void contextLoads() {
		
	}

}
