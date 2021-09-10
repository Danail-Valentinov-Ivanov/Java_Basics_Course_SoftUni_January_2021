package lab6_Nested_Loops;

import java.util.Scanner;

public class task4_Sum_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int num = Integer.parseInt(scan.nextLine());
        int count = 0;
        boolean isValid = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                count++;
                if (i + j == num) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, num);
                    isValid = true;
                    break;
                }


            } if (isValid){
                break;
            }
        } if (!isValid){
            System.out.printf("%d combinations - neither equals %d", count, num);
        }

    }
}
