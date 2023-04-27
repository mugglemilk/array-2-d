
import java.util.Scanner;

public class Winner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] array = new int[r + 1][c + 1];
        int num = 0;
        for (int i = 1; i <= r; ++i) {
            for (int j = 1; j <= c; ++j) {
                array[i][j] = scan.nextInt();
                if (array[i][j] == 1) {
                    num++;
                }
            }
        }

        boolean[][] check = new boolean[r + 1][c + 1];
        int k = scan.nextInt();

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;

        int last = 0;
        int first = -1;

        for (int i = 1; i <= k; ++i) {
            int row = scan.nextInt();
            int col = scan.nextInt();
            if (row > 0 && row <= r && col > 0 && col <= c) {
                if (array[row][col] == 1 && !check[row][col]) {
                    count1++;
                    check[row][col] = true;
                    if (first == -1) {
                        first = i;
                    }

                    last = i;

                } else if (array[row][col] == 0 && !check[row][col]) {
                    count2++;
                    check[row][col] = true;
                } else if (array[row][col] == 1 && check[row][col]) {
                    count3++;
                } else if (array[row][col] == 0 && check[row][col]) {
                    count4++;
                }
            } else {
                count5++;
            }

        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);
        System.out.println(count5);

        if (num == count1) {
            System.out.println("attacker " + last);
        } else {
            System.out.print("battleship " + first);
        }
    }
}
