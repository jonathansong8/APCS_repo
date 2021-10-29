// Team uhhh:  Abdullah Faruque, Jonathan Song, Ari Gurovich
// APCS
// HW27: FOR the Love of Strings
// 2021-10-28
// time spent- 1 hour

/*
DISCO: you can sorta replicate the splicing in python on java using s.substring(i,i+1). still prefer pythons method though. 
QCC: ...
*/

public class Rof{
	
	public static void fenceF(int posts){
		for(int i=1;i<posts;i++){
			System.out.print("|--");
		}
		System.out.print("|");
	}
	public static void reverseF(String s){
		for(int i=s.length();i>0;i--){
			System.out.print(s.substring(i-1,i));
		}
		System.out.print("\n");
	}
	 public static String reverseR(String s){
        int a = s.length();
        if(a==1){
            return s;
        } else {
            return s.substring(a-1) + reverseR(s.substring(0,a-1));//s.substring(a-1) returns the last letter. then we run the function with out the last
        }
    }
	public static void main(String[] args){
	    fenceF(2);
	    fenceF(3);
	    reverseF("1234");
	    reverseF("stressed");
	    System.out.println(reverseR("1234"));
	    System.out.println(reverseR("stressed"));
	}
}

	
