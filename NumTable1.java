
import java.util.Scanner;

public class NumTable1 {

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
        for (int i = 1; i <= k; ++i) {
            int row = scan.nextInt();
            int col = scan.nextInt();
            if (row > 0 && row <= r && col > 0 && col <= c) {
                System.out.print(array[row][col]);
            }else{
                System.out.print("-");
            }
        }
    }
}
