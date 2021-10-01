/*
Team 10 (Gabriel Thompson, Emily Ortiz, Jonathan Song)
APCS
HW08 -- Refactor Freshie Zero
2021-09-30
*/

/*

DISCOVERIES:
 - You can concatenate string literals with variables by simply adding plus signs between,
   you don't have to use formatted strings.
 - If you get an error stating that you are not in a directory where you can commit, you
   need to be in a folder that contains the cloned repo, and be editing files and folders
   that you have "git add"'d.

UNRESOLVED QUESTIONS:
 - Why does "String" require the variable type to be capitalized whereas other datatypes
   (ints, floats, longs, etc.) need to be lowercase? Why is Java case-sensitive in the
   first place?
 - Why does Java require that you exclusively use double quotes for Strings and single
   quotes for characters?
 - We are still having issues with Emily committing to GitHub.

*/

public class Greet {
    public static void main(String[] args) {
        greet("Gabriel");
        greet("Emily");
        greet("Jonathan");
    }
    
    public static void greet(String name) {
        System.out.println("Why, hello there, " + name + ". How do you do?");
    }
}
