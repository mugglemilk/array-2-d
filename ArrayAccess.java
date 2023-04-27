
import java.util.Scanner;

public class ArrayAccess {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] array = new int[n + 1][];
        for (int i = 1; i <= n; ++i) {
            int nn = scan.nextInt();
            array[i] = new int[nn];
            for (int j = 0; j < nn; ++j) {
                array[i][j] = scan.nextInt();
            }
        }
        int sum = 0;
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int outOfBound = 0;
        while (true) {
            int ar_id = scan.nextInt();
            if (ar_id == 0) {
                break;
            }
            int index = scan.nextInt();
            if (ar_id >= 1 && ar_id <= n) {
                if (index >= 0 && index < array[ar_id].length) {
                    sum = sum + array[ar_id][index];
                    if (minValue > array[ar_id][index]) {
                        minValue = array[ar_id][index];
                    }
                    if (maxValue < array[ar_id][index]) {
                        maxValue = array[ar_id][index];
                    }
                } else {
                    outOfBound++;
                }
            } else {
                outOfBound++;
            }
        }
        System.out.println(sum);
        System.out.println(maxValue);
        System.out.println(minValue);
        System.out.println(outOfBound);
    }
}
