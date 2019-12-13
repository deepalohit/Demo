package array;

import java.util.*;

public class Bubble_Sort_NW {
	int arraySort[] = new int[4];
	int temp = 0, i, j, limit;

	void userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		limit = sc.nextInt();
		System.out.println("Enter the array elements");
		for (int k = 0; k < arraySort.length; k++) {
			Scanner sc1 = new Scanner(System.in);
			arraySort[k] = sc1.nextInt();
		}
	}

	void sort() {
		for (i = 0; i < limit; i++) {
			for (j = i + 1; j < limit-1; j++) {
				if(arraySort[i]>arraySort[i+1])
				temp = arraySort[i];
				arraySort[i] = arraySort[j + 1];
				arraySort[j + 1] = temp;
			}

		}
		System.out.println("Sorted array is");
		for (int x = 0; x < limit; x++) {
			System.out.println(arraySort[j]);
		}
	}

	public static void main(String[] args) {
		Bubble_Sort_NW b = new Bubble_Sort_NW();
		b.userInput();
		b.sort();
	}

}
