package ex3_Conditional_Statements_Advanced;

import java.util.Scanner;

public class task2_Summer_Outfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int degrees = Integer.parseInt(scan.nextLine());
        String dayTime = scan.nextLine();
        String outfit = "";
        String shoes = "";

        if ("Morning".equals(dayTime)) {
            if (degrees >= 10 && degrees <= 18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (degrees >= 18 && degrees <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (degrees >= 25) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        } else if ("Afternoon".equals(dayTime)) {
            if (degrees >= 10 && degrees <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (degrees >= 18 && degrees <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if (degrees >= 25) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        } else if ("Evening".equals(dayTime)) {
            if (degrees >= 10 && degrees <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (degrees >= 18 && degrees <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if (degrees >= 25) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        } System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}