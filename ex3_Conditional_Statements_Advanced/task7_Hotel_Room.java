package ex3_Conditional_Statements_Advanced;

import java.util.Scanner;

public class task7_Hotel_Room {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int countNights = Integer.parseInt(scan.nextLine());

        String kindRoom = "";
        double price = 0;

        switch (month) {
            case "May":
            case "October":

                if (countNights > 14) {
                    price = 65 * countNights * 0.90;
                } else {
                    price = 65 * countNights;
                }
                System.out.printf("Apartment: %.2f lv.%n", price);

                if (countNights <= 7) {
                    price = 50 * countNights;
                } else if (countNights <= 14) {
                    price = 50 * countNights * 0.95;
                } else {
                    price = 50 * countNights * 0.70;
                }
                System.out.printf("Studio: %.2f lv.", price);

                break;
            case "June":
            case "September":

                if (countNights > 14) {
                    price = 68.7 * countNights * 0.90;
                } else {
                    price = 68.7 * countNights;
                }
                System.out.printf("Apartment: %.2f lv.%n", price);

                if (countNights > 14) {
                    price = 75.2 * countNights * 0.80;
                } else {
                    price = 75.2 * countNights;
                }
                System.out.printf("Studio: %.2f lv.", price);

                break;
            case "July":
            case "August":

                if (countNights > 14) {
                    price = 77 * countNights * 0.90;
                } else {
                    price = 77 * countNights;
                }
                System.out.printf("Apartment: %.2f lv.%n", price);

                price = 76 * countNights;
                System.out.printf("Studio: %.2f lv.", price);

                break;
        }
    }

}