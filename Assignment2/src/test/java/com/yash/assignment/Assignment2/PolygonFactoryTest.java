package com.yash.assignment.Assignment2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class PolygonFactoryTest {
	PolgonFactory polygonFactoryObj=new PolgonFactory();
	
	@Test
	public void shouldReturnThePolygonNameifsizepassed() {
		String actual=polygonFactoryObj.getPolygon(3).getType();
		assertEquals("Triangle", actual);
	}

	@Test
	public void shouldNotReturnThePolygonNameifsizepassed() {
		String actual=polygonFactoryObj.getPolygon(4).getType();
		assertNotEquals("Triangle", actual);
	}
	@Test
	public void shouldReturnThePolygonOctagonifsizepassediseight() {
		String actual=polygonFactoryObj.getPolygon(8).getType();
		assertEquals("Octagon", actual);
	}
	@Test
	public void shouldReturnThePolygonHeptagonifsizepassediseight() {
		String actual=polygonFactoryObj.getPolygon(7).getType();
		assertEquals("Heptagon", actual);
	}
	@Test
	public void shouldReturnThePolygonPentagonifsizepassediseight() {
		String actual=polygonFactoryObj.getPolygon(5).getType();
		assertEquals("Pentagon", actual);
	}

}
