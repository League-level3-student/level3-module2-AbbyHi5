package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		for (int i = 0; i < array.length; i++) {
			boolean right = true;
			for (int i1 = 0; i1 < array.length - 1; i1++) {
				if (array[i1] > array[i1 + 1]) {
					right = false;
					
				}
			}
			if (!right) {
				for (int i1 = 0; i1 < array.length - 1; i1++) {
					if (array[i1] > array[i1 + 1]) {
						int temp1 = array[i1];
						int temp2 = array[i1 + 1];
						array[i1] = temp2;
						array[i1 + 1] = temp1;
					}
				}
			}
			display.updateDisplay();
		}
	}
	
}
