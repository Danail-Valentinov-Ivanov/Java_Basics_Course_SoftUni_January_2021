package lab6_Nested_Loops;

import java.util.Scanner;

public class task5_Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();

        while (!command.equals("End")) {
            String destination = command;
            double needBudget = Double.parseDouble(scan.nextLine());
            double sumMoney = 0;
            while (sumMoney < needBudget) {
                double saveMoney = Double.parseDouble(scan.nextLine());
                sumMoney += saveMoney;
            }
            System.out.printf("Going to %s!\n", destination);
            command = scan.nextLine();
        }
    }
}
