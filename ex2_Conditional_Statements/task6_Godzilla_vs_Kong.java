package ex2_Conditional_Statements;

import java.util.Scanner;

public class task6_Godzilla_vs_Kong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int numberOfStat = Integer.parseInt(scan.nextLine());
        double priceOfStat = Double.parseDouble(scan.nextLine());

        double budgetDecor = budget * 0.1;
        if (numberOfStat > 150) {
            priceOfStat = priceOfStat * 0.9;
        }
        double sumClothes = priceOfStat * numberOfStat;
        double sumPerFilm = sumClothes + budgetDecor;
        double diferens = budget - sumPerFilm;
        double deficit = sumPerFilm - budget;
        if (sumPerFilm <= budget) {
            System.out.printf("Action!\n"+
                    "Wingard starts filming with %.2f leva left.", diferens);
        } else {
            System.out.printf("Not enough money!\n"+
                    "Wingard needs %.2f leva more.", deficit);
        }
    }
}
