import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
    System.out.print ("enter number 1: ");
    double num1 = input.nextDouble (), num2;
    System.out.print ("enter numer 2: ");
    num2 = input.nextDouble ();
    System.out.print ("enter the opration: ");
    char opration = input.next ().charAt (0);

    System.out.println ();

    if (opration == '+')
      System.out.println ("the addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
    else if (opration == '-')
      System.out.println ("the subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2));
    else if (opration == 'x')
      System.out.println ("the multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
    else if (opration == '/')
      System.out.println ("the divition of " + num1 + " and " + num2 + " is " + (num1 / num2));

      System.out.println ();
      System.out.println ("THANK YOU FOR USING MY CALCULATOR");
  }
}
