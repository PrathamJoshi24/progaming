import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("N = ");
        int n = s.nextInt();
        if (n <= 3 || n >= 10) {
            System.out.println("SIZE IS OUT OF RANGE");
            return;
        }
        s.nextLine();
        System.out.print("Enter First Character: ");
        char c1 = s.nextLine().charAt(0);
        System.out.print("Enter Second Character: ");
        char c2 = s.nextLine().charAt(0);
        System.out.print("Enter Third Character: ");
        char c3 = s.nextLine().charAt(0);
        
        char[][] m = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = (( i == 0 || i == n-1 ) && ( j == 0 || j == n-1) ) ? (i == 0 || i == n-1 || j == 0 || j == n-1) ? (i == 0 || i == n-1 || j == 0 || j == n-1) ? c2 : c1 : c1 : c3;
            }
        }
        
        System.out.println("formed matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}