public class DeciHex {
    int num;
    String hexa;
    
    DeciHex() {
        num = 0;
        hexa = "";
    }
    
    void getNum() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        num = sc.nextInt();
    }
    
    void convert(int n) {
        if (n == 0) {
            return;
        }
        convert(n / 16);
        int remainder = n % 16;
        char hexChar;
        if (remainder < 10) {
            hexChar = (char) ('0' + remainder);
        } else {
            hexChar = (char) ('A' + remainder - 10);
        }
        hexa = hexChar + hexa;
    }
    
    void display() {
        System.out.println("Decimal number = " + num);
        System.out.println("Hexadecimal equivalent = " + hexa);
    }
    
    public static void main(String[] args) {
        DeciHex dh = new DeciHex();
        dh.getNum();
        dh.convert(dh.num);
        dh.display();
    }
}