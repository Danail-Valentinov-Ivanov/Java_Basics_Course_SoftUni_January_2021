package ex1_First_Steps_In_Coding;

import java.util.Scanner;

public class task6_Charity_Campaign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int broiDni = Integer.parseInt(scan.nextLine());
        int broiSladkari = Integer.parseInt(scan.nextLine());
        int broiTorti = Integer.parseInt(scan.nextLine());
        int broiGofreti = Integer.parseInt(scan.nextLine());
        int broiPalachinki = Integer.parseInt(scan.nextLine());
      //  int torta = 45;
        //double gofreta = 5.80;
        //double palachinka = 3.20;

        int tortiPerDenPerSladkar = broiTorti * 45;
        double gofretiPerDenPerSladkar = broiGofreti * 5.80;
        double palacinkiPerDenPerSladkar = broiPalachinki * 3.20;
        double totalSumAllPerDen = (tortiPerDenPerSladkar + gofretiPerDenPerSladkar + palacinkiPerDenPerSladkar) * broiSladkari;
        double brutoSum = totalSumAllPerDen * broiDni;
        double netoSum = brutoSum - brutoSum/8;

        System.out.printf("%.2f", netoSum);




    }
}
