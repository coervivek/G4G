package logest.common.prefix;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		String arr[] = { "apple", "ape", "april"};
		Solution s = new Solution();
		String longestCommonPrefix = s.longestCommonPrefix(arr);
		System.out.println(longestCommonPrefix);
	}

	public String longestCommonPrefix(String[] strs) {
		StringBuilder sb = new StringBuilder();

		Arrays.sort(strs);
		System.out.println(Arrays.toString(strs));
		char[] fst = strs[0].toCharArray();
		char[] last = strs[strs.length - 1].toCharArray();

		for (int i = 0; i < fst.length; i++) {
	
			if (last.length > 1 && last[i] == fst[i]) {
				sb.append(last[i]);
			} else {
				return sb.toString();
			}
		}

		return sb.toString();

	}
}
