/*
Jonathan Song (with Phoenix) and Oscar Breen (with Redhead)
APCS
HW12 -- On Elder Individuality and the Elimination of Radio Fuzz
2021-10-05
*/

/*
DISCO:
 - In order to declare a variable in a class, it has to be declared as a static variable
 - You can name instances of classes to make it easier to refer to them
QCC:
 - How does static change defining variables and functions?
 - Can you set variables in the same way you set functions for classes?
*/

public class BigSib {
	static String helloMsg;
	
	public static void setHelloMsg( String msg ) {
		helloMsg = msg;
	}
	
	public static String greet( String greetingTarget ) {
		return helloMsg + " " + greetingTarget;
	}
}
