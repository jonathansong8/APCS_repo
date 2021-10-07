/*
Jonathan Song (with Phoenix) and Oscar Breen (with Redhead)
APCS
HW13 -- Where Do BigSibs Come From?
2021-10-06
*/

/*
DISCO:
 - You can store the constructor as anything, so long as you recall it.
QCC:
 - Can constructors be created in the helper class?
*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    
    richard.setHelloMsg("Word up");
    greeting = richard.greet("freshman");
    System.out.println(greeting);

    richard.setHelloMsg("Salutations");
    greeting = richard.greet("Dr. Spaceman");
    System.out.println(greeting);

    richard.setHelloMsg("Hey ya");
    greeting = richard.greet("Kong Fooey");
    System.out.println(greeting);

    richard.setHelloMsg("Sup");
    greeting = richard.greet("mom");
    System.out.println(greeting);
  } 
} 
