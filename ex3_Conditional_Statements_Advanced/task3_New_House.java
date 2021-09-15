package ex3_Conditional_Statements_Advanced;

import java.util.Scanner;

public class task3_New_House {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flowers = scan.nextLine();
        int countFlowers = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        double price = 0;

        //prov. cvetia
        switch (flowers) {
            case "Roses":
                price = countFlowers * 5;
                break;
            case "Dahlias":
                price = countFlowers * 3.8;
                break;
            case "Tulips":
                price = countFlowers * 2.8;
                break;
            case "Narcissus":
                price = countFlowers * 3;
                break;
            case "Gladiolus":
                price = countFlowers * 2.5;
                break;
        }
        //prov. otstypka
        if (countFlowers > 80 && flowers.equals("Roses")) {
            price *= 0.9;
        }
        if (countFlowers > 90 && flowers.equals("Dahlias")) {
            price *= 0.85;
        }
        if (countFlowers > 80 && flowers.equals("Tulips")) {
            price *= 0.85;
        }
        if (countFlowers < 120 && flowers.equals("Narcissus")) {
            price *= 1.15;
        }
        if (countFlowers < 80 && flowers.equals("Gladiolus")) {
            price *= 1.2;
        }
        //prov. budget
        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flowers, budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }
    }
}