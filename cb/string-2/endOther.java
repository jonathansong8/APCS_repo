public class endOther {
	public static boolean endOther(String a, String b) {
		boolean result = false;
		b = b.toLowerCase();
		a = a.toLowerCase();
		if (b.length() > a.length()) {
			if ((b.substring(b.length()-a.length())).equals(a)) {
				result = true;
			}
		}
		if (a.length() > b.length()) {
			if ((a.substring(a.length()-b.length())).equals(b)) {
				result = true;
			} 
		}
		if (a.equals(b)) {
			result = true;
		}
		return result;
	}
        public static void main(String[] args) {
                System.out.println(endOther("Hiabc", "abc"));
                System.out.println(endOther("AbC", "HiaBc"));
                System.out.println(endOther("Hiabc", "abcd"));
        }
}
