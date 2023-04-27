
import java.util.Scanner;

public class Triple1 {

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
        for (int i = 1; i <= r; ++i) {
            int count = 0;
            for (int j = 1; j <= c; ++j) {
                if (array[i][j] == k) {
                    count++;
                    if (count == 3) {
                        System.out.print(i+" ");
                        break;
                    }
                }else{
                    count=0;
                }
            }
        }
    }
}
