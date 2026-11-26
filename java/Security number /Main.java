import java.util.Scanner;

class Main {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        Main ob = new Main();
        System.out.print("Security Code: ");
        String cd = sc.next();

        if (!ob.isCd(cd)) {
            System.out.println("invalid input");
            return;
        }

        int ln = cd.length();
        int[] fr = new int[10];

        int so = 0;
        int se = 0;
        long pr = 1;

        for (int i = 0; i < ln; i++) {
            int dg = cd.charAt(i) - '0';
            fr[dg]++;
            if ((i + 1) % 2 == 1) so += dg;
            else se += dg;
            if (dg != 0) pr *= dg;
        }
        int mf = 0;
        int md = 0;
        for (int i = 0; i < 10; i++) {
            if (fr[i] > mf) {
                mf = fr[i];
                md = i;
            }
        }
        int rp = 0;
        for (int i = 0; i < 10; i++) if (fr[i] > 1) rp++;
        String cl;
        cl =  (rp == 0)? "strong code" : (rp == 1)? "modrate code" : "weak code";
        import java.util.Scanner;
        Scanner s = new Scanner(System.in);
        

        System.out.println("first digit: " + cd.charAt(0));
        System.out.println("last digit: " + cd.charAt(ln - 1));
        System.out.println("sum of odd position digits: " + so);
        System.out.println("sum of even position digits: " + se);
        System.out.println("product of non-zero digits : " + pr);

        System.out.println("digit frequency");

        for (int i = 0; i < 10; i++) if (fr[i] > 0) System.out.println(i + ": " + fr[i]);


        System.out.println("most freqent digit: " + md);
        System.out.println("classification: " + cl);
    }

    boolean isCd(String cd) {
        if (cd.length() < 5 || cd.length() > 10) return false;

        for (int i = 0; i < cd.length(); i++) {
            char ch = cd.charAt(i);
            if (ch < '0' || ch > '9') return false;
        }

        return true;
    }
}
