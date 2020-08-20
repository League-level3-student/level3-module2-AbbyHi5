package _02_More_Algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import _00_Sorting_Algorithms.SortingVisualizer;

public class Algorithms {
	public static int findBrokenEgg(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == true) {
				count++;
			}
		}
		return count;
	}

	public static double findTallest(List<Double> list) {
		double tall = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > tall) {
				tall = list.get(i);
			}
		}
		return tall;
	}

	public static String findLongestWord(List<String> list) {
		String word = "";
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() > word.length()) {
				word = list.get(i);
			}
		}
		return word;
	}

	public static boolean containsSOS(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> list) {
		List<Double> temp = Arrays.asList(new Double[] {});
		for (int i = 0; i < list.size(); i++) {
			temp.set(i, 0.0);
		}
		
		for (int i = 0; i < temp.size(); i++) {
			temp.set(i, list.get(i));
		}
		
		Collections.sort(temp);
		System.out.println(list);
		System.out.println(temp);
		return temp;
	}
}
