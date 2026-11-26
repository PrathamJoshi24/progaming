import java.util.Scanner;
class Main {
	public static void main(String[] ar) {
		Scanner s = new Scanner(System.in);
    Main ob = new Main();
		System.out.print("Basin Code: ");
		String bc = s.next();

		if (!ob.isCd(bc)) {
			System.out.println("Invalid Basin Code");
			return;
		}

		System.out.print("N: ");
		int nd = s.nextInt();

		if (nd < 5 || nd > 20) {
			System.out.println("Invalid Number of Days");
			return;
		}

		int[] rf = new int[nd];

		int sm = 0;
		int hi = 0;
		int lo = 0;
		int ex = 0;

		for (int i = 0; i < nd; i++) {
			rf[i] = s.nextInt();

			sm += rf[i];

			if (i == 0) {
				hi = rf[i];
				lo = rf[i];
			}
			else {
				if (rf[i] > hi) hi = rf[i];
				if (rf[i] < lo) lo = rf[i];

			}

			if (rf[i] > 150) ex++;
		}

		String bn = bc.substring(2);
		int ds = ob.dgSm(bn);
		double av = (double) sm / nd;

		System.out.println("basin number: " + bn);
		System.out.println("digit sum: " + ds);
		System.out.println("highest rainfall: " + hi);
		System.out.println("lowest rainfall: " + lo);
		System.out.println("average rainfall: " + av);
		System.out.println("days exceeding 150 mm: " + ex);
		System.out.println((av>150)? "flood warniggg!!! genratedddd!!!": "normall conditions");
	}

	boolean isCd(String bc) {
		if (bc.length() != 6) return false;
		if (!bc.substring(0, 2).equals("RB"))return false;
		for (int i = 2; i < 6; i++) {
			char ch = bc.charAt(i);
			if (ch < '0' || ch > '9') return false;
		}
		return true;
	}

	int dgSm(String bn) {
		int sm = 0;
		for (int i = 0; i < bn.length(); i++) sm += (bn.charAt(i) - '0');
		return sm;
	}
}
