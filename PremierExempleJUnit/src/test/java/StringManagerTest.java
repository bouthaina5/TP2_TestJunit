import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringManagerTest {

	@Test
	void testStringReverse() {
		String in= "hello world";
		String out= "dlrow olleh";
		String res= StringManager.StringReverse(in);
		assertEquals(out,res);
	}

}
