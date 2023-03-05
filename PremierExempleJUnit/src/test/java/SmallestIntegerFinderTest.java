import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmallestIntegerFinderTest {

	@Test
	void FindSmallestIntTest() {
		int tab[] = {17,2,40};
		int expected =2; 
		assertEquals(expected,SmallestIntegerFinder.findSmallestInt(tab) );
		
	}

}
