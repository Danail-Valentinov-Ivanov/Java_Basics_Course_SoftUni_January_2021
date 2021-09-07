package lab3_Conditional_Statements_Advanced;

import java.util.Scanner;

public class task6_Number_in_Range {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int digit = Integer.parseInt(scan.nextLine());
        String answer = "";

        if (digit >= -100 && digit != 0 && digit <= 100){
            answer = "Yes";
        } else {
            answer = "No";
        }
        System.out.println(answer);
    }
}
