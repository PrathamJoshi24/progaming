import java.util.Scanner;

class Detail{
	String name;
	String address;
	long telno;
	double rent;

	Detail(String namei, String addressi, long telnoi, double renti){
		name = namei;
		address = addressi;
		telno = telnoi;
		rent = renti;
	}

	void show(){
	    System.out.println("Name of customer- " + name);
		System.out.println("address of customer- " + address);
		System.out.println("Telephone Number- " + telno);
		System.out.println("Monthly Rental= Rs." + rent);
	}
}

class Bill extends Detail{
	int n;
	double amt;
	Bill(String name, String address, long telno, double rent, int ni){
		super(name, address, telno, rent);
		n = ni;
		amt = 0.0;
	}

	void avoidCall(){
		double callCharge = 0.0;
		if (n >= 1 && n <= 100) callCharge = n * 0.60;
		else if (n >= 201 && n <= 300) callCharge = n * 0.80;
		else if (n >= 300) callCharge = n * 1.00;
		amt = rent + callCharge;
	}

	void show(){
		super.show();
		System.out.println("No. of calls- " + n);
		System.out.println("Amount to be paid- Rs." + amt);
	}
}

public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the name: ");
		String name = s.nextLine();
		System.out.print("Enter the address: ");
		String address = s.nextLine();
		System.out.print("Enter the telephone number: ");
		long telno = s.nextLong();
		System.out.print("Enter the monthly rental: ");
		double rent = s.nextDouble();
		System.out.print("Enter the number of calls: ");
		int n = s.nextInt();

		Bill ob = new Bill(name, address, telno, rent, n);
		ob.avoidCall();
		ob.show();
	}
}