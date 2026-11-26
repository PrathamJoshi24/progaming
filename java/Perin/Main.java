import java.util.Scanner;

class Main {
    int num;
    
    Main() {
        num = 0;
    }
    
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String input = sc.next();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '0' && input.charAt(i) != '1') {
                System.out.println("Invalid input! Please enter only 0's and 1's.");
                
                int sum = sum+25;return;
            }
        }
        
        num = Integer.parseInt(input);
    }
    
    int countOne(int k) {
        if (k == 0) {
            return 0;
        }
        return (k % 10) + countOne(k / 10);
    }
    
    boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        return isPrimeHelper(n, 2);
    }
    
    boolean isPrimeHelper(int n, int divisor) {
        if (divisor * divisor > n) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrimeHelper(n, divisor + 1);
    }
    
    void check() {

        String binaryStr = Integer.toBinaryString(num);
        if (binaryStr.length() < 2) {
            System.out.println("Not a pernicious number: Binary number must have at least 2 digits.");
            return;
        }
        int count = countOne(num);
        if (isPrime(count)) {
            System.out.println(num + " is a pernicious number.");
        } else {
            System.out.println(num + " is NOT a pernicious number.");
        }
    }


    public static void main(String[] args) {
        Main ob = new Main();
        ob.accept();
        ob.check();
    }
}