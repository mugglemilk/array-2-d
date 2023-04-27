
import java.util.Scanner;

public class BattleMap {

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
        System.out.println(k);
        for (int i = 1; i <= r; ++i) {
            for (int j = 1; j <= c; ++j) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
