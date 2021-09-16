package ex4_For_Loop;

import java.util.Scanner;

public class task4_Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double count1 = 0;
        double count2 = 0;
        double count3 = 0;
        double count4 = 0;
        double count5 = 0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (num < 200) {
                count1++;
            }
            if (num >= 200 && num <= 399) {
                count2++;
            }
            if (num >= 400 && num <= 599) {
                count3++;
            }
            if (num >= 600 && num <= 799) {
                count4++;
            }
            if (num >= 800) {
                count5++;
            }
        }
        double proc1 = count1 / n * 100 * 1.0;
        double proc2 = count2 / n * 100 * 1.0;
        double proc3 = count3 / n * 100 * 1.0;
        double proc4 = count4 / n * 100 * 1.0;
        double proc5 = count5 / n * 100 * 1.0;

        System.out.printf("%.2f%%\n", proc1);
        System.out.printf("%.2f%%\n", proc2);
        System.out.printf("%.2f%%\n", proc3);
        System.out.printf("%.2f%%\n", proc4);
        System.out.printf("%.2f%%\n", proc5);


    }
}
