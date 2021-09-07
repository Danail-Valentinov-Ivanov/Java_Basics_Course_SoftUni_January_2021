package lab3_Conditional_Statements_Advanced;

import java.util.Scanner;

public class task10_Invalid_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int digit = Integer.parseInt(scan.nextLine());

        boolean isValid = (digit >= 100) && (digit <= 200) || (digit == 0);
        if (!isValid){
            System.out.println("invalid");
        }
    }
}
