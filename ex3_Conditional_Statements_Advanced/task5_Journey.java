package ex3_Conditional_Statements_Advanced;

import java.util.Scanner;

public class task5_Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String destination = "";
        String kindRelax = "";
        double budgetKindRelax = 0;



        //prov. budget
        if (budget <= 100) {
            destination = "Bulgaria";
            switch (season) {
                case "summer":
                    kindRelax = "Camp";
                    budgetKindRelax = budget * 0.3;
                    break;
                case "winter":
                    kindRelax = "Hotel";
                    budgetKindRelax = budget * 0.7;
                    break;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            switch (season) {
                case "summer":
                    kindRelax = "Camp";
                    budgetKindRelax = budget * 0.4;
                    break;
                case "winter":
                    kindRelax = "Hotel";
                    budgetKindRelax = budget * 0.8;
                    break;
            }
        } else {
            destination = "Europe";
            kindRelax = "Hotel";
            budgetKindRelax = budget * 0.9;
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", kindRelax, budgetKindRelax);
    }
}