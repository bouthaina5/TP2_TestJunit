import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArraysManagerTest {

	@Test
	void SquareSumTest() {
		int tab[] = {1,2,3};
		int expected= 14;
		int res = ArraysManager.squareSum(tab);
		assertEquals(expected, res);
	}

}
