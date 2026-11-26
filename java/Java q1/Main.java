import java.util.Scanner;
public class Main
{
    int[] arr; int search = 0;
    void input(){
        Scanner s = new Scanner(System.in);
        System.out.print("enter the array length: ");
        arr = new int[s.nextInt()];
        System.out.println("enter the elements: ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        System.out.print("enter the number to check: ");
        search = s.nextInt();
        check(0);
    }
    
    void check(int element){
        int f =0;
        if( (element>=arr.length) || (f==1)){
            return ;
        }
        if ((arr[element]==search)){
            f = 1;
            System.out.println(arr[element]+ " found at " + (element-1));
            return;
        }
        check(element+1);
        
    }
	public static void main(String[] args) {
	    Main ob = new Main();
	    ob.input();
		
	}
}
