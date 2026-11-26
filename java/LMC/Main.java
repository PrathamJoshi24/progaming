
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();

		if (m < 4 || m > 9 || n < 4 || n > 9) {
			System.out.println("invalid input");
			return;
		}
		int[][] h = new int[m][n];
		for (int i = 0; i < m; i++) 
			for (int j = 0; j < n; j++) 
				h[i][j] = s.nextInt();
		System.out.println("the matrix is:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) 
				System.out.print(h[i][j] +" ");
			
			System.out.println();
		}
		System.out.println("local minimum cell");
		boolean f = false;
		int min = 999999;
		for (int i = 1; i < m - 1; i++) {
			for (int j = 1; j < n - 1; j++) {
				int cur = h[i][j];
				if (cur < h[i - 1][j] && cur < h[i + 1][j] && cur < h[i][j - 1] && cur < h[i][j + 1]) {
					System.out.println(cur + " at (" + (i + 1) + "," + (j + 1) + ")");
					f = true;
					if (cur < min) min = cur;
				}
			}
		}
		if (!f) System.out.println("no local minimum cell");
		else System.out.println("smallest lmc = " + min);

	}
}
