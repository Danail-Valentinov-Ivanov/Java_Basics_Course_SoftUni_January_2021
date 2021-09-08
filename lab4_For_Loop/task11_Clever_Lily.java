package lab4_For_Loop;

import java.util.Scanner;

public class task11_Clever_Lily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int yearsLili = Integer.parseInt(scan.nextLine());
        double priceWashingMachine = Double.parseDouble(scan.nextLine());
        int priceToy = Integer.parseInt(scan.nextLine());
        double sumBirthday = 0;
        int countToy = 0;
        int countEvenBirthday = 1;
        double totalSumBirthday = 0;

        for (int i = 1; i <= yearsLili; i++) {
            if (i % 2 == 0) {
                sumBirthday += 10 * countEvenBirthday;
                totalSumBirthday = sumBirthday - countEvenBirthday;
                countEvenBirthday++;
            }
            if (i % 2 == 1) {
                countToy++;
            }
        }
        double totalSum = totalSumBirthday + (countToy * priceToy);
        if (totalSum >= priceWashingMachine) {
            System.out.printf("Yes! %.2f", Math.abs(totalSum - priceWashingMachine));
        } else {
            System.out.printf("No! %.2f", Math.abs(totalSum - priceWashingMachine));
        }
    }
}
