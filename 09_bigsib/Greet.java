/*
The Linux Lizards (Gabriel Thompson + Iggy, Hamim Seam + ??, Jonathan Song + Phoenix)
APCS
HW09 -- What Are BigSibs Good For?
2021-10-03
*/

/*
DISCOVERIES:
 - You can call a class from another file by just referring to the class name (e.g. BigSib).
 - You need to compile the other the file with the class that you're referring to into a .class
   file in order to be able to call it w/o error.
 - Not all classes require a main() method, you only need them if you want to directly execute
   code from that file.
 - You can use however much or little spacing you want in Java (such as in function declarations).
UNRESOLVED QUESTIONS:
 - Why do you have to name the class (like in public class <filename>) in a Java file the same
   name as the file itself? Isn't this redundant?
 - How would you call other Java classes from other directories on the filesystem?
 - Why does Java require you to name the class objects the same thing as the Java files they
   compiled from? When you refer to a different Java class, why doesn't Java just want you to name
   the .class filename of the class you're referring to, instead of just assuming it has the same
   name as the class you're referring to?
*/

public class Greet {
    public static void main( String[] args ) {
        BigSib.greet("Gabriel");
        BigSib.greet("Jonathan");
        BigSib.greet("Hamim");
    }
}
