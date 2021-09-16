package ex4_For_Loop;

import java.util.Scanner;

public class task2_Half_Sum_Element {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int sumNum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine());
            if (num > maxNum) {
                maxNum = num;
            }

            sumNum += num;

        }
        int sumWithOutMaxNum = Math.abs(maxNum - sumNum);
        if (sumWithOutMaxNum == maxNum) {
            System.out.println("Yes");
            System.out.println("Sum = " + sumWithOutMaxNum);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(sumWithOutMaxNum - maxNum));
        }
    }
}
