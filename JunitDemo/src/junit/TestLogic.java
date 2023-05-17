package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLogic {
	@Test
	public void testFindMax() {
		assertEquals(5, Calculation.findMax(new int[] {1, 2, 4, 5}));
		assertEquals(5, Calculation.findMax(new int[] {-1, 2, 4, 5}));

	}

}
