
import java.util.Scanner;

public class ShotCheck {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
      
        
        int count1 = 0;
        int count2 = 0;
        int k = scan.nextInt();
        for (int i = 1; i <= k; ++i) {
            int row = scan.nextInt();
            int col = scan.nextInt();
            if (row > 0 && row <= r && col > 0 && col <= c) {
                count1++;
            } else {
                count2++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
    }
}
