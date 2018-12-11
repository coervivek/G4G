package non.repeating.character;

import java.util.Arrays;

class KthNonRepeatingCharSolution {
	public static int MAX_CHAR = 256;

	static int kthNonRepeating(String str, int k) {
		int len = str.length();
		int count[] = new int[MAX_CHAR];
		int index[] = new int[MAX_CHAR];
		// Initialize it
		for (int i = 0; i < len; i++) {
			count[i] = 0;
			index[i] = len;
		}

		for (int i = 0; i < len; i++) {
			char x = str.charAt(i);
			++count[x];

			if (count[x] == 1) {
				index[x] = 1;
			}
			if (count[x] == 2) {
				index[x] = len;
			}

		}

		Arrays.sort(index);

		return index[k - 1] != len ? index[k - 1] : -1;
	}

	public static void main(String[] args) {
		String str = "iamvivekandviveklovejavajavaisgreatlanguage";
		int k = 3;
		int res = kthNonRepeating(str, k);

		System.out.println(res == -1 ? "There are less than k non-repeating characters"
				: "k'th non-repeating character is " + str.charAt(res));
	}
}

// Contributed by Pramod Kumar
