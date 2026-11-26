import java.util.*;
public class Main
{
    int[][] mat;
	    Main(int mm, int m){
	        mat = new int[m][m];
	    }
	    
	   String fun1(){
	       return "2";
	   }
	public static void main(String[] args) {
	        
	    
	    Scanner s=new Scanner(System.in);
	    Main p = new Main(9,7);
	    System.out.println(p.fun1());
	    System.out.print("enter the number of digits in y axis: ");
	    int y = s.nextInt();
	    System.out.print("enter the number of digits in x axis: ");
	    int x = s.nextInt();
	    for (int k = 0;k<y;k++){
	        System.out.println();
	        for (int i = 0;i<x;i++){
	            int r = (int)(Math.round(Math.random()));
		        System.out.print(" "+r);
	        }
	    }
    }
}
