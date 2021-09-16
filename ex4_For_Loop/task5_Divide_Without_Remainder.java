package ex4_For_Loop;

import java.util.Scanner;

public class task5_Divide_Without_Remainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double count1 = 0;
        double count2 = 0;
        double count3 = 0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scan.nextLine());

            if (num % 2 == 0) {
                count1++;
            }
            if (num % 3 == 0) {
                count2++;
            }
            if (num % 4 == 0) {
                count3++;
            }
        }
        count1 = count1 / n * 100;
        count2 = count2 / n * 100;
        count3 = count3 / n * 100;

        System.out.printf("%.2f%%\n", count1);
        System.out.printf("%.2f%%\n", count2);
        System.out.printf("%.2f%%\n", count3);


    }
}
