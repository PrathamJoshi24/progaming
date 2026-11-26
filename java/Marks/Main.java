import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.print("enter name of the student: ");
        String name = s.next();
        
        int math,english,optional,gujrati,sience;
        
        System.out.print("enter marks of maths: ");
        math = s.nextInt();
        System.out.print("enter marks of english: ");
        english = s.nextInt();
        System.out.print("enter marks of optional: ");
        optional = s.nextInt();
        System.out.print("enter marks of gujrati: ");
        gujrati = s.nextInt();
        System.out.print("enter marks of sience: ");
        sience = s.nextInt();
        
        int add = math+english+optional+gujrati+sience;
        
        double div=add*100;
        double per = div/500;
        
        
        
        System.out.println("the avrage score of your child is "+ (math+english+optional+gujrati+sience)/5);
        System.out.println("the percentage is "+ per);
        
        
	}
}
