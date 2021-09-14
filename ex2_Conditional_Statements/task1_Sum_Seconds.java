package ex2_Conditional_Statements;

import java.util.Scanner;

public class task1_Sum_Seconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());
        int sum = first + second +third;

        int minute = sum / 60;
        int seconds = sum % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minute, seconds);
        } else {
            System.out.printf("%d:%d", minute, seconds);
        }
    }
}
