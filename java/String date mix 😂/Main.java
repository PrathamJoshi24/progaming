
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int idx = line.lastIndexOf("Date:");
        if (idx == -1) {
            System.out.println("invalid input");
            return;
        }
        String sentPart = line.substring(0, idx).trim();
        if (sentPart.startsWith("Sentence:")) {
            sentPart = sentPart.substring(9).trim();
        }
        String datePart = line.substring(idx + 5).trim();

        if (sentPart.isEmpty()) {
            System.out.println("invalid input");
            return;
        }
        char endChar = sentPart.charAt(sentPart.length() - 1);
        if (endChar != '.' && endChar != ',' && endChar != '?' && endChar != '!') {
            System.out.println("invalid input");
            return;
        }

        String cleanSent = sentPart.substring(0, sentPart.length() - 1).trim();
        if (cleanSent.isEmpty()) {
            System.out.println("invalid input");
            return;
        }

        int vCount = 0;
        for (int i = 0; i < cleanSent.length(); i++) {
            char ch = Character.toLowerCase(cleanSent.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vCount++;
        }

        if (datePart.length() != 10 || datePart.charAt(2) != '/' || datePart.charAt(5) != '/') {
            System.out.println("invalid date");
            return;
        }
        int d = (datePart.charAt(0) - '0') * 10 + (datePart.charAt(1) - '0');
        int m = (datePart.charAt(3) - '0') * 10 + (datePart.charAt(4) - '0');
        int y = (datePart.charAt(6) - '0') * 1000 + (datePart.charAt(7) - '0') * 100 + (datePart.charAt(8) - '0') * 10 + (datePart.charAt(9) - '0');

        boolean leap = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
        int[] days = { 0, 31, leap ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (m < 1 || m > 12 || d < 1 || d > days[m]) {
            System.out.println("invalid date");
            return;
        }

        int addDays = vCount;
        while (addDays > 0) {
            d++;
            if (d > days[m]) {
                d = 1;
                m++;
                if (m > 12) {
                    m = 1;
                    y++;
                    leap = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
                    days[2] = leap ? 29 : 28;
                }
            }
            addDays--;
        }

        String fD = (d < 10 ? "0" : "") + d;
        String fM = (m < 10 ? "0" : "") + m;
        String fDate = fD + "/" + fM + "/" + y;

        String[] words = cleanSent.split("\\s+");
        for (int i = 0; i < words.length - 1; i++)
        for (int j = 0; j < words.length - 1 - i; j++)
          if (words[j].length() > words[j + 1].length()) {
            String temp = words[j];
            words[j] = words[j + 1];
            words[j + 1] = temp;
        }
            
        

        System.out.println("number of vowels = " + vCount);
        System.out.println("future date (after " + vCount + " days): " + fDate);
        System.out.println("sorted words by length:");
        for (int i = 0; i < words.length; i++) System.out.print(words[i] + " ");
        
        System.out.println();
    }
} 
