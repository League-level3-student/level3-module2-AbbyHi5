package _00_Sorting_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _01_SwappingDigits {
	static int[] sorted;
	@Test
	void test() {
		int[] x = { 5, 6 };
		int[] y = { 6, 5 };
		swapArrayOfTwo(x);
		assertArrayEquals(y, x);

		int[] z = { 7, 3, 5, 9, 2 };
		int[] q = { 2, 3, 5, 7, 9 };
		sortIntArray(z);
		assertArrayEquals(q, z);

		int[] m = { 7, 3, 9, 5, 2 };
		assertEquals(5, findMiddle(m));
	}

	// 1. Complete the method so that the first two elements of the array are
	// swapped
	public static void swapArrayOfTwo(int[] arr) {
		int temp1 = arr[0];
		int temp2 = arr[1];
		arr[0] = temp2;
		arr[1] = temp1;
	}

	// 2. Complete the method so that it sorts the array using a bubble sort.
	// Iterate through the array and when you find two elements that are out
	// of order, swap them. Repeat this until the array is in order.
	public static void sortIntArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean right = true;
			for (int i1 = 0; i1 < arr.length - 1; i1++) {
				if (arr[i1] > arr[i1 + 1]) {
					right = false;
				}
			}
			if (!right) {
				for (int i1 = 0; i1 < arr.length - 1; i1++) {
					if (arr[i1] > arr[i1 + 1]) {
						int temp1 = arr[i1];
						int temp2 = arr[i1 + 1];
						arr[i1] = temp2;
						arr[i1 + 1] = temp1;
					}
				}
			}
			else {
				sorted = arr;
				break;
			}
		}
	}

	// 3. Complete the method so that it finds the middle number in the array.
	// *Hint* it helps to sort it first.
	// *Double Hint* Use the method you already wrote in step 2 to sort it
	public static int findMiddle(int[] arr) {
		int middle = (sorted.length / 2) + 1;
		return arr[middle];
	}
}
