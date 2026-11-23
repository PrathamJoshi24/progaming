import java.util.Scanner;
public class NumberSystemConverter {

    public static String decimalToBinary(int decimal) {
        if (decimal > 1) {
            return decimalToBinary(decimal / 2) + (decimal % 2);
        }
        return String.valueOf(decimal);
    }
    
    public static String decimalToOctal(int decimal) {
        if (decimal > 7) {
            return decimalToOctal(decimal / 8) + (decimal % 8);
        }
        return String.valueOf(decimal);
    }
    

    public static String decimalToHexadecimal(int decimal) {
        if (decimal > 15) {
            return decimalToHexadecimal(decimal / 16) + decimalToHexChar(decimal % 16);
        }
        return decimalToHexChar(decimal);
    }
    
    private static String decimalToHexChar(int value) {
        if (value < 10) {
            return String.valueOf(value);
        }
        return String.valueOf((char)('A' + value - 10));
    }
    
    
    public static int binaryToDecimal(String binary) {
        if (binary.length() == 1) {
            return binary.charAt(0) - '0';
        }
        return 2 * binaryToDecimal(binary.substring(0, binary.length() - 1)) + 
               (binary.charAt(binary.length() - 1) - '0');
    }
    
    public static int octalToDecimal(String octal) {
        if (octal.length() == 1) {
            return octal.charAt(0) - '0';
        }
        return 8 * octalToDecimal(octal.substring(0, octal.length() - 1)) + 
               (octal.charAt(octal.length() - 1) - '0');
    }
    
    public static int hexadecimalToDecimal(String hex) {
        if (hex.length() == 1) {
            return hexCharToDecimal(hex.charAt(0));
        }
        return 16 * hexadecimalToDecimal(hex.substring(0, hex.length() - 1)) + 
               hexCharToDecimal(hex.charAt(hex.length() - 1));
    }
    
    private static int hexCharToDecimal(char hexChar) {
        if (hexChar >= '0' && hexChar <= '9') {
            return hexChar - '0';
        }
        return hexChar - 'A' + 10;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println(" enter convertion : \n 1. decimal to binary\n 2. decimal to octal \n 3. decimal to hexadecimal \n 4. binary to hexadecimal \n 5. hexadecimal to decimal \n 6. octal to decimal ");
        int x = s.nextInt();
        System.out.print("enter the conversion: ");
        String decimal = s.next();
        switch(x){
        case 1:System.out.println(decimal + " to Binary: " + decimalToBinary(Integer.parseInt(decimal)));break;
        case 2:System.out.println(decimal + " to Octal: " + decimalToOctal(Integer.parseInt(decimal)));break;
        case 3:System.out.println(decimal + " to Hexadecimal: " + decimalToHexadecimal(Integer.parseInt(decimal))); break;
        case 4:System.out.println(decimal + " to Decimal: " + binaryToDecimal(decimal));break;
        case 5:System.out.println(decimal + " to Decimal: " + octalToDecimal(decimal));break;
        case 6:System.out.println(decimal + " to Decimal: " + hexadecimalToDecimal(decimal));break;
        }
    }
}