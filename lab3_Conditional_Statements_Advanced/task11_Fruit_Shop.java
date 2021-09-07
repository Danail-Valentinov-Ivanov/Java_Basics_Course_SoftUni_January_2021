package lab3_Conditional_Statements_Advanced;

import java.util.Scanner;

public class task11_Fruit_Shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());



        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
                || day.equals("Thursday") || day.equals("Friday")) {
            double price = 0.0;
            switch (fruit) {
                case "banana":
                    price = quantity * 2.50;
                    System.out.printf("%.2f", price);
                    break;
                case "apple":
                    price = quantity * 1.20;
                    System.out.printf("%.2f", price);
                    break;
                case "orange":
                    price = quantity * 0.85;
                    System.out.printf("%.2f", price);
                    break;
                case "grapefruit":
                    price = quantity * 1.45;
                    System.out.printf("%.2f", price);
                    break;
                case "kiwi":
                    price = quantity * 2.70;
                    System.out.printf("%.2f", price);
                    break;
                case "pineapple":
                    price = quantity * 5.50;
                    System.out.printf("%.2f", price);
                    break;
                case "grapes":
                    price = quantity * 3.85;
                    System.out.printf("%.2f", price);
                    break;
                default:
                    System.out.println("error");
                    break;
            }

        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            double price = 0.0;
            switch (fruit) {
                case "banana":
                    price = quantity * 2.70;
                    System.out.printf("%.2f", price);
                    break;
                case "apple":
                    price = quantity * 1.25;
                    System.out.printf("%.2f", price);
                    break;
                case "orange":
                    price = quantity * 0.90;
                    System.out.printf("%.2f", price);
                    break;
                case "grapefruit":
                    price = quantity * 1.60;
                    System.out.printf("%.2f", price);
                    break;
                case "kiwi":
                    price = quantity * 3.00;
                    System.out.printf("%.2f", price);
                    break;
                case "pineapple":
                    price = quantity * 5.60;
                    System.out.printf("%.2f", price);
                    break;
                case "grapes":
                    price = quantity * 4.20;
                    System.out.printf("%.2f", price);
                    break;
                default:
                    System.out.println("error");
                    break;
            }

        } else {
            System.out.println("error");
        }



    }
}