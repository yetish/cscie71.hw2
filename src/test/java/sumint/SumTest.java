package sumint;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {

	@Test
	public void testSum() {
		assertEquals(20, new Sum().sum(10, 10));
	}

}
