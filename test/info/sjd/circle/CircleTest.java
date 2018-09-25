package info.sjd.circle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

	@Test
	void testGetArea() {
		Circle circle = new Circle(10.0);
		
		assertNotNull(circle.getArea());
		
		assertEquals(314.1592653589793, circle.getArea(),0.1);
		
		assertTrue(circle.getArea() == 314.1592653589793);
		
	}

}
