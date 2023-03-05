import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void testTriangle() {

		assertEquals(1,Triangle.triangle(5, 5, 5));
		assertEquals(2,Triangle.triangle(6, 6, 8));
		assertEquals(3,Triangle.triangle(3, 4, 5));
		assertEquals(3,Triangle.triangle(7, 8, 9));
		assertEquals(0,Triangle.triangle(1, 8, 9));
		
	}

}
