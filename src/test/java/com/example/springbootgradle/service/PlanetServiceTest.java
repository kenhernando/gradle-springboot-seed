package com.example.springbootgradle.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=PlanetService.class)
public class PlanetServiceTest {

	private PlanetService planetService;
	
	@Before
	public void setup() {
		this.planetService = new PlanetService();
	}
	
	@Test
	public void testRetrievePlanetMars() {
		assertEquals("Mars", planetService.retrievePlanetMars());
	}
}
