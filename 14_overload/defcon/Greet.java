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
  public static void main (String[] args) {
    String greeting;
    BigSib richard = new BigSib();
    BigSib grizz = new BigSib();
    BigSib dotCom = new BigSib();
    BigSib tracy = new BigSib();
    greeting = richard.greet("freshman");
    System.out.println(greeting);
    greeting = tracy.greet("Dr. Spaceman");
    System.out.println(greeting);
    greeting = grizz.greet("Kong Fooey");
    System.out.println(greeting);
    greeting = dotCom.greet("mom");
    System.out.println(greeting);
 }
}
