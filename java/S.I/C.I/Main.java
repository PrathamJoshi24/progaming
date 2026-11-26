import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner s = new Scanner(System.in);
	    
		System.out.print("enter principle: ");
		float p = s.nextFloat(), i , a,t;
		
		System.out.print("enter intrest (per anumm): ");
		i= s.nextFloat();
		
		System.out.print("enter the of time taken to return money (years): ");
		t=s.nextFloat();
		
		System.out.print("simple or compound: ");
		char it = s.next().charAt(0);
		
		if (it == 'c'){
    		
    		for (int j = 1; j <= t; j++){
    		    float irm = (i*p)/100;
    		    float a1 = p+irm;
    		    p = a1;
    		    
    		    System.out.println();
    		    System.out.println("the intrest of year "+j+" is $"+irm);
    		}
    		
    		System.out.println();
    		System.out.print("the amount is $"+p);
    	}
    	
    	else{
    	    
    	    float im = (i*p)/100, a2 = p;
    	    for (int v = 1; v <= t; v++){
    		    a2 = a2+im;
    		    
    		    System.out.println();
    	        System.out.println("the amount of year "+v+"is $"+ a2);
            }
        }
    }
}
