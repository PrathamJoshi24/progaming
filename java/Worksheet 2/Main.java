import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//monkeys
		System.out.print("enter monkey 1: ");
		a = s.nextInt();
		System.out.print("enter monkey 2: ");
		b = s.nextInt();
		if((a == 1 && b == 1) || (a == 0 && b == 0)){
		    System.out.println("true");
		}
		else {
		    System.out.println("false");
		}
	

		//last digit
		
		System.out.print("enter a: ");
		a = (s.nextInt())%10;
		System.out.print("enter b: ");
		b = (s.nextInt())%10;
		if(a == b){
		    System.out.println("true");
		}
		else{
		    System.out.println("false");
		}
		
		
		
		//special char
		
	}
}
