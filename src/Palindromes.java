
public class Palindromes {

	public boolean isPalindrome(String string) {
		String z = string.toLowerCase();
		String f = z.replaceAll("[ ,\\., \\!]", "");
		// for (int i = 0; i < f.length(); i++) {
		// if (f.charAt(i) != f.charAt(f.length() - i - 1)) {
		// return false;
		// }
		// }
		StringBuffer buffer = new StringBuffer(f);
		buffer.reverse();
		return f.equals(buffer.toString());
	}

	public Object reverseMe(String string) {
		String m = "";
		for (int i = 0; i < string.length(); i++) {
			m = string.charAt(i) + m;
		}
		return m;
	}

}
