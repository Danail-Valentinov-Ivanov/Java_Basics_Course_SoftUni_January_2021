package ex6_Nested_Loops;

import java.util.Scanner;

public class task1_Number_Pyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int count = 1;
        boolean isBigger = false;

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                if (count > n) {
                    isBigger = true;
                    break;
                }
                System.out.printf("%d ", count);
                count++;
            }
            if (isBigger) {
                break;
            }
            System.out.println();
        }
    }
}
