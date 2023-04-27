
import java.util.Scanner;

public class RowCapacity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] array = new int[r + 1][c + 1];
        int k = scan.nextInt();

        int loop = scan.nextInt();
        for (int i = 1; i <= loop; ++i) {
            int row = scan.nextInt();
            int col = scan.nextInt();
            int add = scan.nextInt();
            int sum = 0;

            for (int j = 1; j <= c; ++j) {
                sum += array[row][j];
            }
            if (sum + add <= k) {
                array[row][col] += add;
            }
        }
        for (int i = 1; i <= r; ++i) {
            for (int j = 1; j <= c; ++j) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
