package JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestingTestCase {

	@Test
	public void test() {
		JunitTesting jt = new JunitTesting();
		int actual_value = jt.square(3);
		assertEquals(9, actual_value);
	}

}
