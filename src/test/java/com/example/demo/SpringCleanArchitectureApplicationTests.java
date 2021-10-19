package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringCleanArchitectureApplicationTests {

	@Test
	void contextLoads() {
	    int test = 5;
	    assertEquals(5, test);
	}

}
