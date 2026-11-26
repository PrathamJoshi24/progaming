import java.util.Scanner;
public class Main {
	boolean isValidTag(String tag) {
		if (tag == null) return false;
		int len = tag.length();
		if (len < 5) return false;
		for (int i = len - 3; i < len; i++) {
			char ch = tag.charAt(i);
			if (ch < '0' || ch > '9') return false;
		}
		if (tag.charAt(len - 4) != '-') return false;
		for (int i = 0; i < len - 4; i++) {
			char ch = tag.charAt(i);
			if (ch < 'A' || ch > 'Z') return false;
		}
		return true;
	}
	String extractNumber(String tag) {
		int len = tag.length();
		return tag.substring(len - 3);
	}
	public static void main(String[] args) {
		Main ob = new Main();
		Scanner s = new Scanner(System.in);

		System.out.print("Enter number of players (N): ");
		int n = s.nextInt();
		if (n < 5 || n > 15) {
			System.out.println("INVALID INPUT");
			return;
		}

		String[] tag = new String[n];
		int[] score = new int[n];
		boolean[] isValid = new boolean[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter tag " + (i + 1) + ": ");
			tag[i] = s.next().trim();
			System.out.print("Enter score " + (i + 1) + ": ");
			score[i] = sc.nextInt();
		}
		System.out.println("\n--- OUTPUT ---");
		int validCount = 0;
		for (int i = 0; i < n; i++) {
			if (ob.isValidTag(tag[i])) {
				System.out.println("Valid Tag: " + tag[i]);
				isValid[i] = true;
				validCount++;
			} else {
				System.out.println("Invalid Tag: " + tag[i]);
				isValid[i] = false;
			}
		}
		boolean teamFound = false;
		boolean[] matched = new boolean[n];

		for (int i = 0; i < n; i++) {
			if (!isValid[i] || matched[i]) continue;

			String num1 = ob.extractNumber(tag[i]);
			int matchIndex = -1;
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (isValid[j] && !matched[j]) {
					String num2 = ob.extractNumber(tag[j]);
					if (num1.equals(num2)) {
						count++;
						matchIndex = j;
					}
				}
			}
			if (count == 2) {
				teamFound = true;
				matched[i] = true;
				matched[matchIndex] = true;

				int combinedScore = score[i] + score[matchIndex];
				System.out.println("TEAMS : " + tag[i] + ", " + tag[matchIndex]);
				System.out.println("Combined Score: " + combinedScore);
			}
		}

		if (!teamFound) System.out.println("TEAMS: NO COMPLETE TEAMS FOUND.");
		if (validCount == 0) System.out.println("TOP SCORER: NO VALID TAGS FOUND.");
		else {
			int maxScore = -1;
			for (int i = 0; i < n; i++) if (isValid[i] && score[i] > maxScore) maxScore = score[i];
			for (int i = 0; i < n; i++) if (isValid[i] && score[i] == maxScore) System.out.println("TOP SCORER: " + tag[i] + " - " + maxScore);
		}
	}
}
