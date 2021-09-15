package ex3_Conditional_Statements_Advanced;

import java.util.Scanner;

public class task1_Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String projection = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());
        double income = 0;

        if (projection.equals("Premiere")) {
            income = rows * columns * 12.00;
        } else if (projection.equals("Normal")) {
            income = rows * columns * 7.50;
        } else if (projection.equals("Discount")) {
            income = rows * columns * 5.00;
        }
        System.out.printf("%.2f leva", income);
    }
}
