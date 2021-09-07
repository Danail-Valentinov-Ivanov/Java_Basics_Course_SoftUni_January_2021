package lab3_Conditional_Statements_Advanced;

import java.util.Scanner;

public class task13_Ski_Trip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        String tipRooms = scan.nextLine();
        String grade = scan.nextLine();
        double totalPrice = 0;

        if (days < 10) {
            switch (tipRooms) {
                case "room for one person":
                    if (grade.equals("positive")) {
                        totalPrice = (days - 1) * 18.0 * 1.25;
                    } else {
                        totalPrice = (days - 1) * 18.0 * 0.9;
                    }
                    break;
                case "apartment":
                    if (grade.equals("positive")) {
                        totalPrice = (days - 1) * 25.0 * 0.7 * 1.25;
                    } else {
                        totalPrice = (days - 1) * 25.0 * 0.7 * 0.9;
                    }
                    break;
                case "president apartment":
                    if (grade.equals("positive")) {
                        totalPrice = (days - 1) * 35.0 * 0.9 * 1.25;
                    } else {
                        totalPrice = (days - 1) * 35.0 * 0.9 * 0.9;
                    }
                    break;
            }
        } else if (days <= 15) {
            switch (tipRooms) {
                case "room for one person":
                    if (grade.equals("positive")) {
                        totalPrice = (days - 1) * 18.0 * 1.25;
                    } else {
                        totalPrice = (days - 1) * 18.0 * 0.9;
                    }
                    break;
                case "apartment":
                    if (grade.equals("positive")) {
                        totalPrice = (days - 1) * 25.0 * 0.65 * 1.25;
                    } else {
                        totalPrice = (days - 1) * 25.0 * 0.65 * 0.9;
                    }
                    break;
                case "president apartment":
                    if (grade.equals("positive")) {
                        totalPrice = (days - 1) * 35.0 * 0.85 * 1.25;
                    } else {
                        totalPrice = (days - 1) * 35.0 * 0.85 * 0.9;
                    }
                    break;
            }
        } else {
            switch (tipRooms) {
                case "room for one person":
                    if (grade.equals("positive")) {
                        totalPrice = (days - 1) * 18.0 * 1.25;
                    } else {
                        totalPrice = (days - 1) * 18.0 * 0.9;
                    }
                    break;
                case "apartment":
                    if (grade.equals("positive")) {
                        totalPrice = (days - 1) * 25.0 * 0.5 * 1.25;
                    } else {
                        totalPrice = (days - 1) * 25.0 * 0.5 * 0.9;
                    }
                    break;
                case "president apartment":
                    if (grade.equals("positive")) {
                        totalPrice = (days - 1) * 35.0 * 0.8 * 1.25;
                    } else {
                        totalPrice = (days - 1) * 35.0 * 0.8 * 0.9;
                    }
                    break;
            }
        }
        System.out.printf("%.2f\n", totalPrice);
    }
}
