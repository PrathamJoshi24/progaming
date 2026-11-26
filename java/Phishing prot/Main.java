import java.util.Scanner;

class Main {
	public static void main(String[] ar) {
		Scanner s = new Scanner(System.in);
		String ln = s.nextLine();

		char en = ln.charAt(ln.length() - 1);
		String tx = ln.substring(0, ln.length() - 1);
		if ((en != '.' && en != '?' && en != '!') || (tx.length() == 0)) {
			System.out.println("invalid inp");
			return;
		}

		boolean ok = true;

		for (int i = 0; i < tx.length() && ok; i++) {
			char ch = tx.charAt(i);

			if ((ch == ' ') && (i == 0 || i == tx.length() - 1 || tx.charAt(i - 1) == ' ' || tx.charAt(i + 1) == ' ')) ok = false;
		}

		if (!ok) {
			System.out.println("invalid inp");
			return;
		}

		String[] ky = {"ACCOUNT", "VERIFY", "PASSWORD","LOGIN", "BANK", "URGENT"};
		String[] wd = tx.toUpperCase().split(" ");

		int ct = wd.length;
		int ph = 0;

		for (int i = 0; i < wd.length; i++)
			if (isKy(wd[i], ky))
				ph++;

		String cl = (ph == 0)? "SAFE" : (ph <= 2)? "SUSPICIOUS" : "PHISHING ALERT";
		String rs = "";

		for (int i = 0; i < wd.length; i++) {
			if (i > 0) rs = rs + " ";

			if (isKy(wd[i], ky)) {
				String rv = "";
				for (int j = wd[i].length() - 1; j >= 0; j--)
					rv += wd[i].charAt(j);
				rs += rv;
			}
			else rs += wd[i];
		}

		System.out.println("words:");
		System.out.println(tx.toUpperCase());
		System.out.println("total words: " + ct);
		System.out.println("phishing words: " + ph);
		System.out.println("classification: " + cl);
		System.out.println("encrypted message:");
		System.out.println(rs);
	}

	static boolean isKy(String wd, String[] ky) {
		for (int i = 0; i < ky.length; i++)
			if (wd.equals(ky[i]))
				return true;
		return false;
	}
}

