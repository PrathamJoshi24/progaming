import java.util.Scanner;

class Main {
	Scanner s = new Scanner(System.in);

	void vacc() {
		System.out.print("Account Number: ");
		String acc = s.next();

		if (acc.length() != 10) {
			System.out.println("invalid input");
			return;
		}

		for (int i = 0; i < acc.length(); i++)
			if (!Character.isDigit(acc.charAt(i))) {
				System.out.println("invalid input");
				return;
			}

		int Tsum = 0;
		for (int i = 0; i < acc.length(); i++) {
			int d = acc.charAt(i) - '0';

			if (i % 2 == 0) {
				d *= 2;

				if (d > 9) d -= 9;
			}

			Tsum += d;
		}

		if (Tsum % 10 == 0) System.out.println("checkum : Valid");
		else System.out.println("checkum : Invalid");

		int ds = 0;

		for (int i = 0; i < acc.length(); i++) ds += (acc.charAt(i) - '0');


		while (ds > 9) {
			int ns= 0;

			while (ds > 0) {
				ns += (ds % 10);
				ds /= 10;
			}

			ds = ns;
		}

		if (ds % 2 == 0) System.out.println("Root : " + ds + " (Root Even)");
		else System.out.println("Root : " + ds + " (Root Odd)");

	}

	public static void main(String args[]) {
		Main ob = new Main();
		ob.vacc();
	}
}