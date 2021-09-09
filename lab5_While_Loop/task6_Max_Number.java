package lab5_While_Loop;

import java.util.Scanner;

public class task6_Max_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int numMax = Integer.MIN_VALUE;
        while (!input.equals("Stop")) {
            int num = Integer.parseInt(input);
            input = scan.nextLine();
            if (num > numMax) {
                numMax = num;

            }
        }System.out.println(numMax);
    }
}
