package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void test() {
		TestingClass test = new TestingClass();
		int output = test.square(5);
		assertEquals(25, output);
	}

}
