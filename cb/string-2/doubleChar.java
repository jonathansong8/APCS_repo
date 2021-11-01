public class doubleChar {
	public static String doubleChar(String str) {
		String results = "";
		for (int i=0; i<str.length(); i++) {
			results += str.substring(i, i+1);
			results += str.substring(i, i+1);
		}
		return results;
	}

	public static void main(String[] args) {
		System.out.println(doubleChar("The"));
		System.out.println(doubleChar("AAbb"));
		System.out.println(doubleChar("Hi-There"));
	}
}
