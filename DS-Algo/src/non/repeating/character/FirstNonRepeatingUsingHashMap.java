package non.repeating.character;

import java.util.HashMap;

class CountIndex {
	int count, index;

	// constructor for first occurrence
	public CountIndex(int index) {
		this.count = 1;
		this.index = index;
	}

	// method for updating count
	public void incrementCount() {
		this.count++;
	}
}

class FirstNonRepeatingUsingHashMap {
	static final int NO_OF_CHARS = 256;
	static HashMap<Character, CountIndex> hm = new HashMap<Character, CountIndex>(NO_OF_CHARS);

	static void getCharCountArray(String str) {

		for (int i = 0; i < str.length(); i++) {
			// If character already occurred,
			if (hm.containsKey(str.charAt(i))) {
				// updating count
				hm.get(str.charAt(i)).incrementCount();
			}

			// If it's first occurrence, then store the index and count = 1
			else {
				hm.put(str.charAt(i), new CountIndex(i));
			}

		}
	}

	static int firstNonRepeating(String str) {
		getCharCountArray(str);
		int result = Integer.MAX_VALUE, i;

		for (i = 0; i < str.length(); i++) {
			// If this character occurs only once and appears
			// before the current result, then update the result
			System.out.println(hm.get(str.charAt(i)).index);
			if (hm.get(str.charAt(i)).count == 1 && result > hm.get(str.charAt(i)).index) {
				result = hm.get(str.charAt(i)).index;
			}

		}

		return result;
	}

	public static void main(String[] args) {
		String str = "iamvivekandilovejava";
		int index = firstNonRepeating(str);

		System.out.println(index == Integer.MAX_VALUE ? "Either all characters are repeating or string is empty"
				: "First non-repeating character is " + str.charAt(index));
	}
}
