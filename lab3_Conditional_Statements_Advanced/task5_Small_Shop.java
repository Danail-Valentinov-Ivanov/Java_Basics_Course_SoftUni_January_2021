package lab3_Conditional_Statements_Advanced;

import java.util.Scanner;

public class task5_Small_Shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String city = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        double price = 0;

        switch (product){
            case "coffee":
                switch (city){
                    case "Sofia":
                        price = quantity * 0.5;
                        break;
                    case "Plovdiv":
                        price = quantity * 0.4;
                        break;
                    case "Varna":
                        price = quantity * 0.45;
                        break;
                }
                break;
            case "water":
                switch (city){
                    case "Sofia":
                        price = quantity * 0.8;
                        break;
                    case "Plovdiv":
                        price = quantity * 0.7;
                        break;
                    case "Varna":
                        price = quantity * 0.7;
                        break;
                }
                break;
            case "beer":
                switch (city){
                    case "Sofia":
                        price = quantity * 1.2;
                        break;
                    case "Plovdiv":
                        price = quantity * 1.15;
                        break;
                    case "Varna":
                        price = quantity * 1.1;
                        break;
                }

                break;
            case "sweets":
                switch (city){
                    case "Sofia":
                        price = quantity * 1.45;
                        break;
                    case "Plovdiv":
                        price = quantity * 1.3;
                        break;
                    case "Varna":
                        price = quantity * 1.35;
                        break;
                }
                break;
            case "peanuts":
                switch (city){
                    case "Sofia":
                        price = quantity * 1.6;
                        break;
                    case "Plovdiv":
                        price = quantity * 1.5;
                        break;
                    case "Varna":
                        price = quantity * 1.55;
                        break;
                }
                break;

        }
        System.out.println(price);
    }
}
