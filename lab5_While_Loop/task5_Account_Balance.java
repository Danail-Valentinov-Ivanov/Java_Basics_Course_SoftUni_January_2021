package lab5_While_Loop;

import java.util.Scanner;

public class task5_Account_Balance {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        double sum = 0;
        while (!command.equals("NoMoreMoney")) {
            double amount = Double.parseDouble(command);
            if (amount < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            sum = sum + amount;
            System.out.printf("Increase: %.2f\n", amount);
            command = scan.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}
