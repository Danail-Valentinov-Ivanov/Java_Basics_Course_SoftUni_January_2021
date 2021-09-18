package ex5_While_Loop;

import java.util.Scanner;

public class task3_Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double needMoney = Double.parseDouble(scan.nextLine());
        double currentMoney = Double.parseDouble(scan.nextLine());
        int countInputSpend = 0;

        int countSpendDays = 0;

        while (currentMoney < needMoney) {
            String input = scan.nextLine();
            double sum = Double.parseDouble(scan.nextLine());
            if (input.equals("spend")) {
                currentMoney -= sum;
                countInputSpend++;
                countSpendDays++;
                if (sum > currentMoney) {
                    currentMoney = 0;
                }
                if (countInputSpend == 5) {

                    break;
                }
            }
            if (input.equals("save")) {
                currentMoney += sum;

                countInputSpend = 0;
                countSpendDays++;
            }

        }
        if (currentMoney >= needMoney) {
            System.out.printf("You saved the money for %d days.", countSpendDays);
        }
        if (countInputSpend == 5) {
            System.out.printf("You can't save the money.\n");
            System.out.printf("%d", countSpendDays);
        }
    }
}
