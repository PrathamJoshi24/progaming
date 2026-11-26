import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int pass = s.nextInt();
		for (int i = 0000;i<=9999999999;) {
		    if(i == pass){
                System.out.println(" <- succses"); break;
            }
            else{
                System.out.println(" fail");
            }
            System.out.print(++i);
		}
	}
}
