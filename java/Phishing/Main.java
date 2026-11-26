import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String password = "this is me talking to computer all by my self";
        int lenth = password.length();
        char keys[] = new char[lenth];
        //for(int a = 1;a <= lenth; a++){
          //  keys[a] = (char)a;}
        char key = 0;
        int le;
        // System.out.println(lenth);
        for(int i = 0;i<lenth;i++){
            
            key = 2;
            le = lenth;
            while(true){
                for(int w=0;w<=10000;w++){w++;}
                System.out.print("\033c");
                char pass = password.charAt(i);
                key++ ;
                for(int w = 0; w<le;w++)
                        System.out.print(keys[w]);
                System.out.println(key);        
                if(key==pass){
                    System.out.print("\033c");
                    for(int j = 0; j<le;j++)
                        System.out.print(keys[j]);
                        System.out.println(key);
                    
                    keys[i] = key;
                    break;
                }
                
            }
        }
	}
}
