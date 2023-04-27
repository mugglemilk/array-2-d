
import java.util.ArrayList;
import java.util.Scanner;

public class HotSpot {

    static int[] sumCols(int[][] array, final int r, final int c, final int target) {
        int[] colSums = new int[c + 1];
        for (int col = 1; col <= c; ++col) {
            int colSum = 0;
            for (int row = 1; row <= r; ++row) {
                if (array[row][col] == target) {
                    ++colSum;
                }
            }
            colSums[col] = colSum;
        }
        return colSums;
    }

    static int[] sumRows(int[][] array, final int r, final int c, final int target) {
        int[] rowSums = new int[r + 1];
        for (int row = 1; row <= r; ++row) {
            int rowSum = 0;
            for (int col = 1; col <= c; ++col) {
                if (array[row][col] == target) {
                    ++rowSum;
                }
            }
            rowSums[row] = rowSum;
        }
        return rowSums;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int r = scan.nextInt();
        final int c = scan.nextInt();
        int[][] array = new int[r + 1][c + 1];
        for (int row = 1; row <= r; ++row) {
            for (int col = 1; col <= c; ++col) {
                array[row][col] = scan.nextInt();
            }
        }
        int target = scan.nextInt();
        int[] colSums = sumCols(array, r, c, target);
        int[] rowSums = sumRows(array, r, c, target);
        int maxSum = -1;
        ArrayList<Integer> maxRows = new ArrayList<>();
        ArrayList<Integer> maxCols = new ArrayList<>();
        for (int row = 1; row <= r; ++row) {
            for (int col = 1; col <= c; ++col) {
                int pointSum = colSums[col] + rowSums[row];
                if (array[row][col] == target) {
                    --pointSum;
                }
                if (pointSum > maxSum) {
                    maxRows.removeAll(maxRows);
                    maxCols.removeAll(maxCols);
                    maxRows.add(row);
                    maxCols.add(col);
                    maxSum = pointSum;
                } else if (pointSum == maxSum) {
                    maxRows.add(row);
                    maxCols.add(col);
                }
            }
        }
        System.out.println(maxSum);
        System.out.println(maxCols.size());
        for (int i = 0; i < maxCols.size(); ++i) {
            System.out.println(maxRows.get(i) + " " + maxCols.get(i));
        }
    }
}
