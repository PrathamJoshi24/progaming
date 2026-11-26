
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() != 10 || s.charAt(2) != '/' || s.charAt(5) != '/') {
            System.out.println("invalid date");
            return;
        }
        int d = (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');
        int m = (s.charAt(3) - '0') * 10 + (s.charAt(4) - '0');
        int y = (s.charAt(6) - '0') * 1000 + (s.charAt(7) - '0') * 100 + (s.charAt(8) - '0') * 10 + (s.charAt(9) - '0');

        boolean leap = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
        int[] days = { 0, 31, leap ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (m < 1 || m > 12 || d < 1 || d > days[m]) {
            System.out.println("invalid date");
            return;
        }

        int rem = days[m] - d;
        System.out.println("days remaining: " + rem);

        int sum = 0;
        int temp = d;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        temp = m;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        temp = y;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("digit sum = " + sum);

        boolean sq = false;
        for (int i = 1; i * i <= sum; i++) 
            if (i * i == sum) {
                sq = true;
                break;
            }

        if (sq) System.out.println("special date");
         else System.out.println("regular date");
        
    }
}

