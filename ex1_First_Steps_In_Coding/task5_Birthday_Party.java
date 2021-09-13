package ex1_First_Steps_In_Coding;

import java.util.Scanner;

public class task5_Birthday_Party {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rentOfHall = Integer.parseInt(scan.nextLine());

        double cenaTorta = rentOfHall * 0.2;
        double cenaNapitki = cenaTorta - cenaTorta * 0.45;
        double cenaAnimator = rentOfHall / 3.0;
        double needSum = rentOfHall + cenaTorta + cenaNapitki + cenaAnimator;

        System.out.println(needSum);


    }
}
