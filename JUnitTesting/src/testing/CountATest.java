package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountATest {

	@Test
	void test() {
		TestingClass test = new TestingClass();
		int output = test.countA("java");
		assertEquals(2, output);
	}

}
