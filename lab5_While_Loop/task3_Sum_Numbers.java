package lab5_While_Loop;

import java.util.Scanner;

public class task3_Sum_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int sum = 0;

        while (sum < num) {
            int currentNum = Integer.parseInt(scan.nextLine());
            sum += currentNum;
        }
        System.out.println(sum);
    }
}
