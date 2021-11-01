public String makeAbba(String a, String b) {
  String message = a + b + b + a;
  return message;
  
  	public static void main(String[] args) {
		System.out.println(makeAbba("Hi", "Bye"));
		System.out.println(makeAbba("Yo", "Alice"));
		System.out.println(makeAbba("What", "Up") );
	}
}
