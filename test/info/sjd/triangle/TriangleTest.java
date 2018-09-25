package info.sjd.triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void testGetArea() {
		Triangle tri = new Triangle(10.0, 5.0);
		
		assertNotNull(tri.getArea());
		
		assertEquals(25.0, tri.getArea(),0.1);
		
		assertTrue(tri.getArea() == 25.0);
		
	}

}
