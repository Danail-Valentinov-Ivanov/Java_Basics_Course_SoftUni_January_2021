package ex1_First_Steps_In_Coding;

import java.util.Scanner;

public class task2_Radians_to_Degrees {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radians = Double.parseDouble(scan.nextLine());

        double degrees = radians * 180 / Math.PI;

        System.out.printf("%.0f", degrees);
    }
}
