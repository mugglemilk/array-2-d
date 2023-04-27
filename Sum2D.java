
import java.util.Scanner;

public class Sum2D {

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
        int[] arrayRow = new int[r + 1];
        for (int i = 1; i <= r; ++i) {
            for (int j = 1; j <= c; ++j) {
                arrayRow[i] += array[i][j];
            }
        }
        int[] arrayCol = new int[c + 1];
        for (int j = 1; j <= c; ++j) {
            for (int i = 1; i <= r; ++i) {
                arrayCol[j] += array[i][j];
            }
        }
        for (int i = 1; i <= r; ++i) {
            for (int j = 1; j <= c; ++j) {
                System.out.print((arrayRow[i] + arrayCol[j] - array[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
