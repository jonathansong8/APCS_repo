public class catDog {
	public static boolean catDog(String str) {
		int count0 = 0;
		int count1 = 0;
		for (int i = 0; i < (str.length() - 2); i++) {
			if (str.substring(i, i+3).equals("cat")) count0++;
			if (str.substring(i, i+3).equals("dog")) count1++;
		}
		if (count0 == count1) {
			return true;
		}
		else {
			return false;
		}
	}
        public static void main(String[] args) {
                System.out.println(catDog("catdog"));
                System.out.println(catDog("catcat"));
                System.out.println(catDog("1cat1cadodog"));
        }
}
