import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		//area of Circle
		
		float radius;
		double pi=3.14;
		System.out.print("enter the radius: ");
		radius=s.nextFloat();
		
		System.out.println("the area of the circle is "+pi*radius*radius);
		
		//area of square
		System.out.print("length: ");
		float length = s.nextFloat();
		System.out.println("area of the square is "+length*length);
		
		//area of rectangle
		System.out.print("enter the length: ");
		length=s.nextFloat();
		float breadth;
		System.out.print("enter the breadth: ");
		breadth = s.nextFloat();
		System.out.println("area = "+length*breadth);
		
		//area of right angled triangle
		System.out.print("enter the length: ");
		length = s.nextFloat();
		System.out.print("enter the breadth: ");
		breadth = s.nextFloat();
		System.out.println("the area of triangle is "+1/2*length*breadth);
		
		//volume of sphere
		System.out.print("enter radius: ");
		radius = s.nextFloat();
		System.out.println("the volume is "+4/3*pi*radius*radius*radius);
		
		//volume of Clone
		System.out.print("enter the radius: ");
		radius = s.nextFloat();
		System.out.print("enter the hieght: ");
		float hieght =s.nextFloat();
		System.out.println("the volume of cone is "+1/3*hieght*pi*radius*radius);
		
		//volume of cylinder
		System.out.print("enter radius: ");
		radius=s.nextFloat();
		System.out.print("enter the hieght: ");
		hieght = s.nextFloat();
		System.out.println("the volume is "+pi*radius*radius*hieght);
		
		//volume of cube
		System.out.print("enter the lenght: ");
		length = s.nextFloat();
		System.out.println("the volume of the cube is "+length*length*length);
		
		//volume of cuboid
		System.out.print("enter the length: ");
		length = s.nextFloat();
		System.out.print("enter the breadth: ");
		breadth = s.nextFloat();
		System.out.print("enter hieght: ");
		hieght = s.nextFloat();
		System.out.println("the volume is "+length*breadth*hieght);
		
		//perimeter of nanagon
		System.out.print("enter the length: ");
		length = s.nextFloat();
		System.out.println("the perimeter is "+length*9);
		
		
	}
}
