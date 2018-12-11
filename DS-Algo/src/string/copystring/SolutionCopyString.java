package string.copystring;

public class SolutionCopyString {

	public static void main(String[] args) {
		String s1 = "Vivek";
		String s2 = "Khushi";
		copyString(s1, s2);
	}

	private static void copyString(String s1, String s2) {
		char[] s1Chars = s1.toCharArray();
		char[] s2Chars = s2.toCharArray();
		for (int i = 0; i < s1Chars.length; i++) {
			s2Chars[i] = s1Chars[i];
		}
		s2 = String.valueOf(s2Chars).substring(0, s1.length());
		System.out.println(s2);
	}

}
