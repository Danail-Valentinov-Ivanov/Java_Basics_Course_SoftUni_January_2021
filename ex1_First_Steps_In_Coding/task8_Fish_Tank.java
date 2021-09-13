package ex1_First_Steps_In_Coding;

import java.util.Scanner;

public class task8_Fish_Tank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d = Integer.parseInt(scan.nextLine());
        int sh = Integer.parseInt(scan.nextLine());
        int v = Integer.parseInt(scan.nextLine());
        double procent = Double.parseDouble(scan.nextLine());

        double totalObem = d * sh * v * 0.001;
        double procentOtObema = procent * 0.01;
        double realObem = totalObem * (1-procentOtObema);

        System.out.println(realObem);

    }
}
