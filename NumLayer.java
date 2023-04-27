
import java.util.Scanner;

public class NumLayer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] array = new int[r][c];

        int numLayer;//จำนวนชั้น
        if (r < c) {
            numLayer = r / 2;
        } else {
            numLayer = c / 2;
        }
        for (int i = 0; i < numLayer; ++i) {//ชั้น
            int count = 0;//นับจำนวนการพิมพ์
            for (int col = i; col < c - i; ++col) {
                array[i][c] = count % 10;
                count += 1;
            }
            for (int row = i + 1; row < r - 1; ++row) {
                //for (int col = 0; col < c; ++col) {
                array[r][c - i - 1] = count % 10;
                count += 1;
            }
            for (int col = c - i - 2; col >= i; --col) {//แถวบน
                array[r - 1 - i][c] = count % 10;
                count += 1;
            }
            for (int row = r-i-2; row >= i+1; --row) {//ซ้ายไปขวา
                array[row][i] = count % 10;
                count += 1;
            }
        }
        for (int row = 0; row < r; ++row) {//ลงล่าง
            for (int col = 0; col < c; ++col){
                System.out.print(array[r][c] + " ");
             
            }
            System.out.println("");
        }      
    }
}

