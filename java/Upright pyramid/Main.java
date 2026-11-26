import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.print("enter no of lines: ");
	    int finalthing = s.nextInt();
	    int z = finalthing; 
	    for(int i=1;i<=finalthing*2;i+=2 ){
	        System.out.println();
	        for(int y=1;y<=i;y++){
	             if(y==1){
	                 for(int w = z;w>=0;w--){
	                     System.out.print(" ");
	                 }
	                 
	             }
	             System.out.print("*");      
	             
	        }
	        z--;
	    }
	}
}
