package reverse.string;

import java.util.Arrays;

public class ReverseArrayUsingRecursion {

	public static void main(String[] args) {
		int arr[] = { 7, 6, 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(arr));
		rvereseArray(arr, 0, arr.length - 1); // end is n-1
		System.out.print("Reversed array is \n");
		System.out.println(Arrays.toString(arr));
	}

	private static void rvereseArray(int[] arr, int start, int end) {
		if (start > end) {
			return;
		}
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		rvereseArray(arr, start+1, end-1);
	}
}
