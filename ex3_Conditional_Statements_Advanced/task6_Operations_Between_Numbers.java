package ex3_Conditional_Statements_Advanced;

import java.util.Scanner;

public class task6_Operations_Between_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int digit_1 = Integer.parseInt(scan.nextLine());
        int digit_2 = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int result = 0;
        String even_odd = "";

        if (digit_2 == 0 && (operator.equals("/") || operator.equals("%"))) {
            System.out.printf("Cannot divide %d by zero", digit_1);
        } else {

            if (operator.equals("+")) {
                result = digit_1 + digit_2;
                if (result % 2 == 0) {
                    even_odd = "even";
                } else {
                    even_odd = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", digit_1, operator, digit_2, result, even_odd);
            }
            if (operator.equals("-")) {
                result = digit_1 - digit_2;
                if (result % 2 == 0) {
                    even_odd = "even";
                } else {
                    even_odd = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", digit_1, operator, digit_2, result, even_odd);
            }
            if (operator.equals("*")) {
                result = digit_1 * digit_2;
                if (result % 2 == 0) {
                    even_odd = "even";
                } else {
                    even_odd = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", digit_1, operator, digit_2, result, even_odd);
            }
            if (operator.equals("/")) {
                double digit_11 = digit_1 * 1.00;
                double digit_22 = digit_2 * 1.00;
                double result_2 = digit_11 / digit_22;
                System.out.printf("%d %s %d = %.2f", digit_1, operator, digit_2, result_2);
            }
            if (operator.equals("%")) {
                result = digit_1 % digit_2;
                System.out.printf("%d %s %d = %d", digit_1, operator, digit_2, result);
            }
        }
    }
}
