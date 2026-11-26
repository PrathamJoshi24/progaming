import java.util.Scanner;
public class Main
{
  static boolean isp(int x){
    for(int i = 2 ;i < x; i++)
      if(x%i == 0 || x==1) return false;
    return true;
  }
  static int conv(int x){
    String bin = "";
    while(x>0){
      bin+=x%2;
      x/=2;
    }
    String rev = "";
    for(int i = bin.length()-1 ; i>=0; i--) rev+=bin.charAt(i);
    return Integer.parseInt(rev);
  }
  static int valid(int x){ 
    int t = x;
    while(t>0){ 
      if(!(t%10==0 || t%10==1)) x = conv(x);
      t/=10;
    }
    return x;
  }
  static int no1(int x){
    int n = 0;
    while(x>0){
      if(x%10==1){
       n++;
       x/=10;
      }
    }
    System.out.println(n);
    return n;
  }
	public static void main(String[] args){ System.out.println((isp(no1(valid((new Scanner(System.in)).nextInt())))?"is a":"is not a") + " perni number");}
	
}