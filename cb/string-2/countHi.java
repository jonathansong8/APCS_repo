public class countHi {
	public static int countHi(String str) {
		int result = 0; 
		char first = 'h';
		char secound = 'i';
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == first) {
				if (str.length() > 1) {
					if (str.charAt(i+1) == secound) {
						result += 1;
					}
				}
			}
		}
		return result;
	}
        public static void main(String[] args) {
                System.out.println(countHi("abc hi ho"));
                System.out.println(countHi("ABChi hi"));
                System.out.println(countHi(""));
        }
}
