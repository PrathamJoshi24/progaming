import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

		
		int p1=0,p2=0;
		
		Scanner s=new Scanner(System.in);
	    while (true) {
	        System.out.println("*******************************************");
	        System.out.println("*        technical voting system          *");
	        System.out.println("*******************************************");
	        
	        System.out.println("enter your vote");
	        System.out.println("");
	        System.out.println("1. pratham joshi ");
	        System.out.println("2. yug bhimani ");
	        
	        int vote= s.nextInt();
	        if (vote == 1)
                p1 = p1 + 1;
	        else if (vote == 2)
	            p2 = p2+ 1;
	        else
	            break;
	        System.out.print("\033c");
	   
	    }
	    
	    
	    if (p1>p2)
	        System.out.println("mr. pratham won by "+ (p1-p2) + " votes");
	   else if (p1 < p2)
	        System.out.println("mr. yug won by "+ (p2-p1)+ " votes");
	   else 
            System.out.println("one vote left");
	        
	}
}
