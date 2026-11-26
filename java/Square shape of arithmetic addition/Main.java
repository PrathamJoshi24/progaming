public class Main
{
	public static void main(String[] args) {
	    int add = 1;
	    int m = 1;
		for(int i = 1;i<=4;i++){
		    System.out.println();
		    for(int j = 1;j<=4;j++){
		        add+=2;
		        System.out.print(m+" ");
		        m+=add;
		    }
		}
	}
}