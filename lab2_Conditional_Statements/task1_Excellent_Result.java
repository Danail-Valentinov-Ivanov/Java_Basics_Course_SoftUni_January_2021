package lab2_Conditional_Statements;

import java.util.Scanner;

public class task1_Excellent_Result {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade = Integer.parseInt(scan.nextLine());

        if (grade>=5) {
            System.out.println("Excellent!");
        }
    }

}
