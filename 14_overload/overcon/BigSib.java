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

public class BigSib {   

	// instanced var
	private String mmsg; 

	// default constructor
	public BigSib(){
		mmsg = "Word up";
	}

	// overloaded constructor 
	public BigSib (String msg){		
		 mmsg = msg;
	}

        public String greet (String name){
		return(mmsg + " " +  name);

        }
}
