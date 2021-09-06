package lab2_Conditional_Statements;

import java.util.Scanner;

public class task7_Toy_Shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceEx = Double.parseDouble(scan.nextLine());
        int numPuzzles = Integer.parseInt(scan.nextLine());
        int numDolls = Integer.parseInt(scan.nextLine());
        int numBears = Integer.parseInt(scan.nextLine());
        int numMinions = Integer.parseInt(scan.nextLine());
        int numTrucks = Integer.parseInt(scan.nextLine());
        int numTotalToys = numPuzzles + numDolls + numBears + numMinions + numTrucks;

        double sumPuzzles = numPuzzles * 2.60;
        double sumDolls = numDolls * 3.00;
        double sumBears = numBears * 4.10;
        double sumMinions = numMinions * 8.20;
        double sumTrucks = numTrucks * 2.00;
        double sumToys = sumPuzzles + sumDolls + sumBears + sumMinions + sumTrucks;
        if (numTotalToys >= 50) {
            sumToys = sumToys * 0.75;
        } else {
            sumToys = sumPuzzles + sumDolls + sumBears + sumMinions + sumTrucks;
        }
        double sumNetoToys = sumToys * 0.9;
        if (sumNetoToys >= priceEx) {
            double difference = sumNetoToys - priceEx;
            System.out.printf("Yes! %.2f lv left.", difference);
        } else if (sumNetoToys < priceEx) {
            double difference = priceEx - sumNetoToys;
            System.out.printf("Not enough money! %.2f lv needed.", difference);
        }
    }
}
