package lab4_For_Loop;

import java.util.Scanner;

public class task8_Number_sequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int y = Integer.parseInt(scan.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < y; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (num > maxNum) {
                maxNum = num;
            }
            if (num < minNum) {
                minNum = num;
            }

        }
        System.out.printf("Max number: %d\n", maxNum);
        System.out.printf("Min number: %d", minNum);
    }
}
