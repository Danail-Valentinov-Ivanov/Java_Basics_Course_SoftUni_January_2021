package lab1_First_Steps_In_Coding;

import java.util.Scanner;

public class task8_Pet_Shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int broiKucheta = Integer.parseInt(scan.nextLine());
        int broiOstanali = Integer.parseInt(scan.nextLine());

        double cenaObshto = broiKucheta * 2.50 + broiOstanali * 4;

        System.out.println(cenaObshto);

    }
}
