
import java.util.Scanner;

public class NumTable3 {

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
        int max = 0;
        int count = 0;
        int num = 0;
        for (int i = 1; i <= k; ++i) {
            int row = scan.nextInt();
            int col = scan.nextInt();
            if (row > 0 && row <= r && col > 0 && col <= c) {
                count++;
                if (i == k) {
                    if (count > max) {
                        max = count;
                        num = 0;
                    }
                    if (count == max) {
                        num++;
                    }
                }
            } else {
                if (count > max) {
                    max = count;
                    num = 0;
                }
                if (count == max) {
                    num++;
                }
                count = 0;
            }
        }
        System.out.println(max + "\n" + num);
    }
}
