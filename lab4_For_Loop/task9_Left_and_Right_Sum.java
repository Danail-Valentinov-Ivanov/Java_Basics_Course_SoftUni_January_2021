package lab4_For_Loop;

import java.util.Scanner;

public class task9_Left_and_Right_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            leftSum += num;
        }
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            rightSum += num;
        }

        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d\n", rightSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(rightSum - leftSum));
        }


    }
}
