import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Number of zones: ");
        int z = s.nextInt();

        if (z < 2 || z > 5) {
            System.out.println("INVALID ZONE");
            return;
        }

        System.out.print("Number of days: ");
        int d = s.nextInt();

        if (d < 5 || d > 15) {
            System.out.println("INVALID DAYS");
            return;
        }

        int[][] a = new int[z][d];

        for (int i = 0; i < z; i++) {
            for (int j = 0; j < d; j++) {
                a[i][j] = s.nextInt();
            }
        }

        int mx = -1;
        int mz = 0;

        for (int i = 0; i < z; i++) {
            int sm = 0;

            for (int j = 0; j < d; j++) sm += a[i][j];
            

            if (sm > mx) {
                mx = sm;
                mz = i;
            }
        }

        System.out.println();
        System.out.println("Highest Total Orders:");
        System.out.println("Zone " + (mz + 1) + " : " + mx + " orders");

        System.out.println();
        System.out.println("High Demand Days:");

        for (int i = 0; i < z; i++) {
            int sm = 0;

            for (int j = 0; j < d; j++) sm += a[i][j];
            

            double av = (double) sm / d;
            boolean ok = false;

            System.out.print("Zone " + (i + 1) + " : ");

            for (int j = 0; j < d; j++) {
                if (a[i][j] > av) {
                    if (ok) {
                        System.out.print(", ");
                    }

                    System.out.print("Day " + (j + 1));
                    ok = true;
                }
            }

            if (!ok) {
                System.out.print("None");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("Increase in Orders:");

        for (int i = 0; i < z; i++) {
            boolean ok = false;

            System.out.print("Zone " + (i + 1) + " : ");

            for (int j = 1; j < d; j++) {
                if (a[i][j] > a[i][j - 1]) {
                    if (ok) {
                        System.out.print(", ");
                    }

                    System.out.print("Day " + (j + 1));
                    ok = true;
                }
            }

            if (!ok) System.out.print("None");
            System.out.println();
        }

    }
}
