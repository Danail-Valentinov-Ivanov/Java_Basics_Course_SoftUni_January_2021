package lab1_First_Steps_In_Coding;

import java.util.Scanner;

public class task4_Inches_to_Centimeters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double inch = Double.parseDouble(scan.nextLine());

        double convert = inch * 2.54;

        System.out.println(convert);
    }
}
