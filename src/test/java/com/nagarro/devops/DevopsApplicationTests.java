package com.nagarro.devops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevopsApplicationTests {
	
	Logger lg = LoggerFactory.getLogger(DevopsApplicationTests.class);

	@Test
	void contextLoads() {
		lg.info("Test Working!!!!!!!!!!!!!!!!!!!!!!!!!");
		assertEquals(true, true);
	}

}
