
import java.util.Scanner;

public class ArrayExploration2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] array = new int[r + 1][c + 1];
        for (int i = 1; i <= r; ++i) {
            for (int j = 1; j <= c; ++j) {
                array[i][j] = scan.nextInt();
            }
        }
        int k = scan.nextInt();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        int a = 0;
        int b = 0;

        for (int i = 1; i <= k; ++i) {
            int row = scan.nextInt();
            int col = scan.nextInt();
            if (row > 0 && row <= r && col > 0 && col <= c) {
                if (array[row][col] > 0) {
                    count1++;
                }
                if (array[row][col] < 0) {
                    count2++;
                }
                if (array[row][col] % 2 == 0) {
                    count3++;
                }
                if (array[row][col] % 2 != 0) {
                    count4++;
                }
                a = row;
                b = col;
            } else {
                if (array[a][b] > 0) {
                    count1++;
                }
                if (array[a][b] < 0) {
                    count2++;
                }
                if (array[a][b] % 2 == 0) {
                    count3++;
                }
                if (array[a][b] % 2 != 0) {
                    count4++;
                }
            }
        }
        System.out.print(count1 + " ");
        System.out.print(count2 + " ");
        System.out.print(count3 + " ");
        System.out.print(count4 + " ");
    }
}
