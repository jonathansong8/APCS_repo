/*
Jonathan Song (with Phoenix), Oscar Breen (with Redhead), and Abdullah Faruque (with Green Lantern)
APCS
HW14 -- Customize Your Creation
2021-10-07
*/

/*
DISCO:
 - The default constructor can be overwritten
 - The default constructor doesn't take a paramter, while the overloaded constructor does 
QCC:
 - What is the difference between using a default constructor and using a overloaded constructor?
*/

public class Greet {
  public static void main (String[] args){
  String greeting;
	BigSib richard = new BigSib("Word up");
	greeting = richard.greet("freshman"); 
	System.out.println(greeting);
	BigSib spaceman = new BigSib("Salutations");
	greeting = spaceman.greet("Dr.Spaceman");
	System.out.println(greeting);
	BigSib kong = new BigSib("Hey ya");
	greeting = kong.greet("Kong Foey");
	System.out.println(greeting);
	BigSib mom = new BigSib("Sup");
	greeting = mom.greet("mom");
	System.out.println(greeting);        
	}                               
}
