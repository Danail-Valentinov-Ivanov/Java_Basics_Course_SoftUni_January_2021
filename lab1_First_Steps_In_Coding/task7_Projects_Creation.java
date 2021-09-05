package lab1_First_Steps_In_Coding;

import java.util.Scanner;

public class task7_Projects_Creation {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String name = scan.nextLine();
        int broiProekti = Integer.parseInt(scan.nextLine());

        int needHours = broiProekti * 3;

        System.out.println("The architect " + name + " will need " + needHours + " hours to complete " + broiProekti + " project/s.");
    }
}
