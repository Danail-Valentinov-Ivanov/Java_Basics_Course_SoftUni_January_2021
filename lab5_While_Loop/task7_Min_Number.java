package lab5_While_Loop;

import java.util.Scanner;

public class task7_Min_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int numMin = Integer.MAX_VALUE;
        while (!input.equals("Stop")) {
            int num = Integer.parseInt(input);
            input = scan.nextLine();
            if (num < numMin) {
                numMin = num;

            }
        }
        System.out.println(numMin);
    }
}
