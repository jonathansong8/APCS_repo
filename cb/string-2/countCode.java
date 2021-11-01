public class countCode {
	public static int countCode(String str) {
		int count = 0;
		for (int i = 0; i < (str.length() - 3); i++) {
			if (str.substring(i, i+2).equals("co")) {
				if (str.substring(i+3, i+4).equals("e")) {
					count += 1;
				}
			}
		}
		return count;
	}
        public static void main(String[] args) {
                System.out.println(countCode("aaacodebbb"));
                System.out.println(countCode("codexxcode"));
                System.out.println(countCode("cozexxcope"));
        }
}
