
import java.util.Scanner;

public class MapMarking1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] map = new int[r + 1][c + 1];

        int row = scan.nextInt();
        int col = scan.nextInt();
        map[row][col] = 1;

        int n = scan.nextInt();
        int count = 1;

        for (int i = 0; i < n; ++i) {
            int order = scan.nextInt();

            if (order == 1 && col - 1 > 0) {
                --col;

            } else if (order == 2 && col + 1 <= c) {

                ++col;

            } else if (order == 3 && row - 1 > 0) {

                --row;

            } else if (order == 4 && row + 1 <= r) {

                ++row;

            }
            if (map[row][col] == 0) {
                count++;
            }
            map[row][col] = 1;
        }
        System.out.println(row + " " + col + "\n" + count);
    }
}
