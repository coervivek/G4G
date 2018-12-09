package logest.common.prefix;

import java.util.Arrays;

public class Solution2 {

	public String longestCommonPrefix(String[] a) {

		int size = a.length;
		if (size == 0) {
			return "";
		}
		if (size == 1) {
			return a[size];
		}

		Arrays.sort(a);

		int minLen = Math.min(a[0].length(), a[size - 1].length());
		int i = 0;
		while (i < minLen && a[0].charAt(i) == a[size - 1].charAt(i)) {
			i++;
		}
		System.out.println(i);
		return a[0].substring(0, i);
	}

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		String[] input = { "geeksforgeeks", "geeks", "geek", "geezer" };
		System.out.println("The longest Common Prefix is : " + sol.longestCommonPrefix(input));
	}
}
