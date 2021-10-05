/*
The Linux Lizards (Gabriel Thompson (duckie: Iggy), Jonathan Song (duckie: Phoenix), Hamim Seam (duckie: Vansh))
APCS
HW10 -- Refactor Big Sib One
2021-10-04
*/

/*
DISCOVERIES:
 - When you try to concatenate a String and int in Java, you do not need to convert the int to
   String, but you can rather just concatenate them as you would concatenate Strings.
 - You can use the datatype String as a return type in functions.
UNRESOLVED QUESTIONS:
 - Why is datatype name for Strings uppercase, whilst all other data types are lower case (int,
   float, long, etc.)
 - Why are you able to concatenate Strings and ints in Java w/o conversion, whereas you need to
   convert the ints to Strings in Python?
 - In text editors (such as nano) why doesn't the "String" datatype get colored the same way
   that other datatypes do?
*/

public class Greet {
    public static void main( String[] args ){
        System.out.println( BigSib.greet("Crosby") );
        System.out.println( BigSib.greet("Stills") );
        System.out.println( BigSib.greet("Nash") );
    }
}
