public class xyzThere {
	public static boolean xyzThere(String str) {
		boolean result = false;
		if (str.length() < 3) {
			return false;
		}
		if (str.substring(0, 3).equals("xyz")){
			result = true;
		}
		for (int i = 1; i < str.length() - 2; i ++) {
			if (str.substring(i, i + 3).equals("xyz")) {
				result = true;
				if (str.substring(i - 1, i + 3).equals(".xyz")) {
					result = false;
				}
				else {
					result = true;
				}
			}
		}
		return result;
	}      
        public static void main(String[] args) {
                System.out.println(xyzThere("abcxyz"));
                System.out.println(xyzThere("abc.xyz"));
                System.out.println(xyzThere("xyz.abc"));
        }
}
