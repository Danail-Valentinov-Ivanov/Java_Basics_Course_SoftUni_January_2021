package lab4_For_Loop;

import java.util.Scanner;

public class task4_Even_Powers_of_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double x = 0;
        for (int i = 0; i <= n; i++) {
            x = Math.pow(2, i);
            if (i % 2 == 0) {
                System.out.printf("%.0f%n", x);
            }
        }
    }
}