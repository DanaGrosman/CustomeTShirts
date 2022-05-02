package ajbc.testing.custometshirts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class DesignTest {

	private Design design = new Design();
	
	public DesignTest() {
	}
	
	@Test
	void checkValueOfFieldsOfEmptyConstractor() {
		assertEquals(20, design.width);
		assertEquals(10, design.height);
		assertEquals("", design.slogan);
		assertEquals(new Color(), design.color);
		assertEquals(1, design.complexity);
	}
	
	@Test
	void checkSetWidth() {
		design.setWidth(30);
		assertEquals(30, design.width);
	}
	
	@Test
	void checkSetHeight() {
		design.setHeight(15);
		assertEquals(15, design.height);
	}
	
	@Test
	void checkSetComplexity() {
		design.setComplexity(102);
		assertEquals(1, design.complexity);
	}
	
	@Test
	void checkCalculateArea() {
		double area = design.height * design.width; 
		assertEquals(area, design.calculateArea());
	}
}
