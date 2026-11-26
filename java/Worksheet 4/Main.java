import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("enter number ");
        int n = s.nextInt(),sum=0;int x;int l = n;
        int p = n;
        int pro = 1;
        for(;n>0;){
            x=n%10;
            sum+=x;
            sum= sum*10+x;
            sum+=(x*x*x);
            pro *=n;
            n--;
            n/=10;
                        
        }
        int f = 1;
        for(int z=f;z<=n;z++){
            if(n%z==0){
                sum = z;
                System.out.print(" "+sum);    
            }
            
        }
        for(;n>0;){
            x=n%10;
            sum+=x
            n/=10;
                        
        }
        //q4
        for(;n>0;){
            x=n%10;
            pro *=n;
            n--;
            n/=10;
        }
        System.out.print(sum);
        //q3
        for(;n>0;){
            x=n%10;
            sum= sum*10+x;
            n/=10;
        }
        if(sum==p) System.out.print("the number entered is ");
        else System.out.print("the number is not ");
        System.out.print(sum);
        
        
        //q2
        for(;n>0;){
            x=n%10;
            sum= sum*10+x;
            n/=10;
        }
        System.out.print(sum);
        //q1
        for(;n>0;){
            x=n%10;
            sum+=x;
            n/=10;
        }
        
        System.out.print(sum);
	}
}