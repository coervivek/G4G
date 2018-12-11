package string.copystring;

public class SwapFirstLastCharacters {

	public static void main(String[] args) {
		String str = "I love java";
		swapFirstLastCharacters(str);
	}

	private static void swapFirstLastCharacters(String str) {

		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			int frst = i;

			while (i < charArray.length && charArray[i] != ' ') {
				i++;
			}

			char temp = charArray[frst];
			charArray[frst] = charArray[i - 1];
			charArray[i - 1] = temp;
		}

		System.out.println(new String(charArray));
	}

}
