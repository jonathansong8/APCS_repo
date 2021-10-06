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
