package lab1_First_Steps_In_Coding;

import java.util.Scanner;

public class task9_Yard_Greening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double kvM = Double.parseDouble(scan.nextLine());

        double totalCena = kvM * 7.61;
        double discount = totalCena * 0.18;
        double netoCena = totalCena - discount;

        System.out.println("The final price is " + netoCena + " lv.");
        System.out.println("The discount is " + discount + " lv.");
    }
}
