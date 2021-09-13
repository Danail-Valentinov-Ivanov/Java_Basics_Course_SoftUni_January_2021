package ex1_First_Steps_In_Coding;

import java.util.Scanner;

public class task7_Fruit_Market {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double cenaIagodi = Double.parseDouble(scan.nextLine());
        double kolichBanani = Double.parseDouble(scan.nextLine());
        double kolichProtokali = Double.parseDouble(scan.nextLine());
        double kolichMalini = Double.parseDouble(scan.nextLine());
        double kolichIagodi = Double.parseDouble(scan.nextLine());

        double cenaMalini = cenaIagodi * (1-0.5);
        double cenaProtokali = cenaMalini * (1-0.4);
        double cenaBanani = cenaMalini * (1-0.8);
        double sumIgodi = kolichIagodi * cenaIagodi;
        double sumMalini = kolichMalini * cenaMalini;
        double sumProtokali = kolichProtokali * cenaProtokali;
        double sumBanani = kolichBanani * cenaBanani;
        double totalSum = sumIgodi + sumMalini + sumProtokali + sumBanani;

        System.out.printf("%.2f", totalSum);



    }
}
