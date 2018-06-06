import java.util.Scanner;

public class SpiralMatrix {
	public static void main(String[] args) {
		System.out.println("Enter value of M: ");
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		System.out.println("Enter value of N: ");
		int n = in.nextInt();
		in.close();
		int[][] spiral = new int[m][n];
		int minCol = 0, minRow = 0;
		int maxCol = n-1, maxRow = m-1;
		int counter = 1;
		while(counter <= m*n) {
			for(int i = maxCol; i >= minCol; i--) {
				spiral[maxRow][i] = counter++;
			}
			for(int i = maxRow-1; i>=minRow; i--) {
				spiral[i][minCol] = counter++;
			}
			for(int i = minCol+1; i <= maxCol; i++) {
				spiral[minRow][i] = counter++;
			}
			for(int i = minRow+1; i <= maxRow-1; i++) {
				spiral[i][maxCol] = counter++;
			}
			minCol++;
			maxCol--;
			minRow++;
			maxRow--;
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf(spiral[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
