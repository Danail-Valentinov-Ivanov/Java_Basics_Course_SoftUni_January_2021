package lab2_Conditional_Statements;

import java.util.Scanner;

public class task2_Greater_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        if (a>b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
