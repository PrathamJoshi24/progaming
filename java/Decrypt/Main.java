import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("CODE: ");
        String code = s.nextLine();
        
        if (!code.matches("\\d+")) {
            System.out.println("INVALID INPUT");
            return;
        }
        
        String decoded = "";
        int i = 0;
        int num=0;
        while (i < code.length()) {
            
            
            if (num >= 65 && num <= 90 || (num >= 97 && num <= 122) || num == 32) {
                decoded += ((char) num);
            }
            
            if (i < code.length() && code.charAt(i) == ' ') {
                i++;
            }
        }
        
        String result = decoded.trim();
        System.out.println(result);
        String[] words = result.split(" ");
        String finalResult = "";
        
        for (int j = 0; j < words.length; j++) {
            if (!words[j].isEmpty()) {
                String word = words[j];
                finalResult += Character.toUpperCase(word.charAt(0));
                if (word.length() > 1) {
                    finalResult += word.substring(1).toLowerCase();
                }
                if (j < words.length - 1) {
                    finalResult += " ";
                }
            }
        }
        
        System.out.println(finalResult);
    }
}