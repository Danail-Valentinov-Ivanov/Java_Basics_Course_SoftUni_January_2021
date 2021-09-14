package ex2_Conditional_Statements;

import java.util.Scanner;

public class task4_Metric_Converter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double digit = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();
        String output = scan.nextLine();
        double outDigit = 0;

        if (input.equals("mm")) {
            digit = digit * 0.001;
        } else  if (input.equals("cm")) {
            digit = digit * 0.01;
        }

        if (output.equals("m")) {
            outDigit = digit;
        } else if (output.equals("cm")) {
            outDigit = digit * 100;
        } else if (output.equals("mm")) {
            outDigit = digit * 1000;
        }
        System.out.printf("%.3f", outDigit);
    }
}
