import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    while(true){
	        System.out.println();
	        System.out.println();
	        System.out.println();
    	    int no1=0,no2=0;
    		System.out.println("menu \n1.addition\n2.subtraction\n3.multipllication\n4.division\n5.exit");
    		System.out.print("enter your choise: ");
    		int cho = s.nextInt();
    		if (cho <= 6){
    		    if(cho < 5){
        		    System.out.print("enter number 1: ");
        		    no1 = s.nextInt();
                    System.out.print("enter number 2: ");
        		    no2 = s.nextInt();
    		    }
        		switch(cho){
        		    case 1:
        		        System.out.println("the awnser is "+(no1+no2));
        		        break;
        		    case 2:
        		        System.out.println("the awnser is "+(no1-no2));
        		        break;
        		    case 3:
        		        System.out.println("the awnser is "+(no1*no2));
        		        break;
        		    case 4:
        		        System.out.println("the awnser is "+(no1/no2));
        		        break;
        		    case 5:
        		        System.out.println("thank you for using the app");
        		        
        		    default:
        		        break;
        		}  
        		if(cho==5){
        		    break;
        		}
    		}
    		else {
    		    System.out.println("invalid chiose");
    		}
    	}
	}
}