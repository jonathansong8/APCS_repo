public String helloName(String name) {
  String message = "Hello " + name + "!";
  return message;
  
  	public static void main(String[] args) {
		System.out.println(helloName("Bob"));
		System.out.println(helloName("X"));
		System.out.println(helloName("ho ho ho"));
	}
}
