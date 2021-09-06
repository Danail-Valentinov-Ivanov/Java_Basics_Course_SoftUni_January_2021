package lab2_Conditional_Statements;

import java.util.Scanner;

public class task4_Number_100_200 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int enter = Integer.parseInt(scan.nextLine());

        if (enter < 100) {
            System.out.println("Less than 100");
        } else if (enter <= 200) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Greater than 200");
        }

    }
}
