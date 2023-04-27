
import java.util.Scanner;

public class ColumnSummaryClinic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] rowcol = new int[r + 1][c + 1];
        for (int row = 1; row <= r; ++row) {
            for (int col = 1; col <= c; ++col) {
                rowcol[row][col] = scan.nextInt();
            }
        }
        int k = scan.nextInt(); // numb I'm interested in
        int count = 0;//col = value set col = 0 and becuz loop will be start 0

        for (int col = 1; col <= c; ++col) {

            int sum = 0;

            for (int row = 1; row <= r; ++row) {
                if (rowcol[row][col] == k) {
                    ++sum;
                }
            }
            if (sum > 0) {
                System.out.print(sum + " ");
            } else {
                System.out.print("* ");

            }
            count += sum;
        }
        System.out.print("\n" + count);//print col 
    }
}
