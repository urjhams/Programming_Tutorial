import java.util.Arrays;

public class BubbleSort {
//intermediate

	//todo: sort an array using bubblesort.
	//if you don't know how bubblesort works you can read it here: http://www.pkirs.utep.edu/CIS3355/Tutorials/chapter9/tutorial9A/bubblesort.htm

	public static void main(String[] args) {
		int[] unSortedArray = {10, 61, 3, 7, 12, 4, 16, 8, 0, 12, 45, 2, 41, 65, 2, 1, 34};
		System.out.println(Arrays.toString(bubbleSortOf(unSortedArray)));
	}
	private static int[] bubbleSortOf(int[] input) {
		int[] unsorted = input;
		for (int times = 0; times < unsorted.length - 5; times++) {
			for (int limitIndex = 0; limitIndex < unsorted.length - times -1; limitIndex++) {
				if (unsorted[limitIndex] > unsorted[limitIndex + 1]) {
					int temp = unsorted[limitIndex];
					unsorted[limitIndex] = unsorted[limitIndex + 1];
					unsorted[limitIndex + 1] = temp;
				}
			}
		}
		return unsorted;
	}

	/*
		------------------------ knowledge -----------------------------------------
		for bubble sort, fetch each couple of element from start to end
		cause we have take a couple of element, the limit will be lengrh - 1
		if the element bigger than the next element, swap them.
		because of this swap in fetching whole the array each time,
		each time, we'll get the bigest number at the last position,
		so after a loop, we decrease the limit (length - 1) to 1
		so here after each loop outside, we got times increase 1
		=> we set limitIndex run to length - 1 - times.
		So the loop will stop or turn to next loop without fetching the last element
		=> better performance
	*/

}
