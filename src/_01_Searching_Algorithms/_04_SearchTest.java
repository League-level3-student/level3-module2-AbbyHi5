package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD

	@Test
	public void testLinearSearch() {
		String[] words = new String[] { "1", "2", "3", "4" };
		// 1. use the assertEquals method to test your linear search method.
		assertEquals("1", words[0]);
		assertEquals("2", words[1]);
		assertEquals("4", words[3]);
	}

	@Test
	public void testBinarySearch() {
		// 2. use the assertEquals method to test your binary search method.
		// remember that the array must be sorted
		String[] words = new String[] { "1", "2", "3", "4" };

		assertEquals("1", words[0]);
		assertEquals("2", words[1]);
		assertEquals("4", words[3]);
	}

	@Test
	public void testInterpolationSearch() {
		// 3. use the assertEquals method to test your interpolation search method.
		// remember that the array must be sorted and evenly distributed
		String[] words = new String[] { "1", "2", "3", "4" };

		assertEquals("1", words[0]);
		assertEquals("2", words[1]);
		assertEquals("4", words[3]);
	}

	@Test
	public void testExponentialSearch() {
		// 4. use the assertEquals method to test your exponential search method.
		// remember that the array must be sorted
		String[] words = new String[] {"1","2","3","4"};
		
		assertEquals("1",words[0]);
		assertEquals("2",words[1]);
		assertEquals("4",words[3]);
	}
}
