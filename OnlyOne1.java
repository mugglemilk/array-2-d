
import java.util.Scanner;

public class OnlyOne1 {

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
        int count = 0;
        int max = 0;
        int maxLaster = 0;
        for (int j = 1; j <= c; ++j) {
            for (int i = 1; i <= r; ++i) {
                if (array[i][j] == 1) {
                    count++;
                }
                if (count >= max) {
                    max = count;
                    maxLaster = j;
                }
            }
            count = 0;
        }
        System.out.println(max);
        System.out.println(maxLaster);
    }
}
