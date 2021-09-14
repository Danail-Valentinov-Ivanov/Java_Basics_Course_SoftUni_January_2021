package ex2_Conditional_Statements;

import java.util.Scanner;

public class task2_Bonus_Score {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int digit = Integer.parseInt(scan.nextLine());
        double bonus = 0;
        double totalScope = 0;

        if (digit <= 100) {
            bonus = 5;
            totalScope = digit + bonus;
        } else if (digit < 1000) {
            bonus = digit * 0.2;
            totalScope = digit + bonus;
        } else {
            bonus = digit * 0.1;
            totalScope = digit + bonus;
        }
        if (digit % 2 == 0) {
            bonus = bonus + 1;
            totalScope = totalScope + 1;
        } else if (digit % 10 == 5) {
            bonus = bonus + 2;
            totalScope = totalScope + 2;
        }
        System.out.println(bonus);
        System.out.println(totalScope);

    }
}
