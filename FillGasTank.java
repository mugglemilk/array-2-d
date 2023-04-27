
import java.util.Scanner;

public class FillGasTank {

    static int fuelCost(String size, double station) {
        double a = 0;
        if ("L".equals(size)) {
            a = station / 60 * 350;
        } else if ("M".equals(size)) {
            a = station / 60 * 270;
        } else if ("S".equals(size)) {
            a = station / 60 * 200;
        }
        a += 0.1;
        return (int) a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] array = new int[n + 1][n + 1];
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                array[i][j] = scan.nextInt();
            }
        }
        int k = scan.nextInt();
        for (int i = 1; i <= k; ++i) {
            String size = scan.next();
            int firstStation = scan.nextInt();
            int lastStation = scan.nextInt();
            int count = fuelCost(size, array[firstStation][lastStation]);
            System.out.println(count);
        }
    }
}
