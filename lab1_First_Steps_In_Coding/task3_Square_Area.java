package lab1_First_Steps_In_Coding;

import java.util.Scanner;

public class task3_Square_Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());

        int area = a * a;

        System.out.println(area);
    }
}
