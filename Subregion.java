
import java.util.Scanner;

public class Subregion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] array = new int[r + 1][c + 1];

        int Firstrow = scan.nextInt();
        int Firstcol = scan.nextInt();

        int Lastrow = scan.nextInt();
        int Lastcol = scan.nextInt();

        if (Firstrow < 1 || Firstrow + Lastrow - 1 > r || Firstcol < 1 || Firstcol + Lastcol - 1 > c) {
            System.out.println("invalid input");
        } else {
            for (int i = Firstrow; i <= Firstrow + Lastrow - 1; ++i) {
                for (int j = Firstcol; j <= Firstcol + Lastcol - 1; ++j) {
                    array[i][j] = 1;
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
}
