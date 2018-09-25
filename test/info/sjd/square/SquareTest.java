package info.sjd.square;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void testGetArea() {
		Square square = new Square(10.0);
		
		assertNotNull(square.getArea());
		
		assertEquals(100.0, square.getArea(),0.1);
		
		assertTrue(square.getArea() == 100.0);
		
		
		
		
	}

}
