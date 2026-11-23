import java.util.Scanner;

class Special {
    int n;
    
    Special() {
        n = 0;
    }
    
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
    }
    
    int factorial(int x) {
        if (x <= 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }
    
    int sumOfFactorials(int num) {
        if (num == 0) {
            return 0;
        }
        return factorial(num % 10) + sumOfFactorials(num / 10);
    }
    
    boolean isSpecial() {
        int sum = sumOfFactorials(Math.abs(n));
        return sum == Math.abs(n);
    }
    
    void display() {
        if (isSpecial()) {
            System.out.println(n + " is a Special number.");
        } else {
            System.out.println(n + " is NOT a Special number.");
        }
    }


    public static void main(String[] args) {
        Special s = new Special();
        s.read();
        s.display();
    }
}