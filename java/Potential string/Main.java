import java.util.Scanner;
public class Main
{
    String st;
    Main(String x){
        st = x;
    }
    
    void wordsplit(){
        String word="";
        for(int i = 0; i<st.length()-1; i++){
            if(st.charAt(i)!=' ')
                word+=st.charAt(i);
            else if(i==st.length()-1 || st.charAt(i)==' '){
                System.out.println(word+" = "+potential(word));
                word="";}
        }
    }
    int potential(String word){
        int sum=0;
        for(int i=0;i<word.length();i++){
            sum+=word.charAt(i);
        }
        return sum;
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter the line:");
		String st = s.nextLine();
		Main ob = new Main(st);
		int f=0;
        switch(st.charAt(st.length()-1)){
            case '?':ob.wordsplit();break;
            case '.':ob.wordsplit();break;
            case '!':ob.wordsplit();break;
            default: System.out.println("invalid input");
        }
	}
}
