package ex1_First_Steps_In_Coding;

import java.util.Scanner;

public class task4_Vacation_Books_List {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int allSheets = Integer.parseInt(scan.nextLine());
        int sheetsPerHour = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        int totalTime = allSheets / sheetsPerHour;
        int hourPerDay = totalTime / days;


        System.out.println(hourPerDay);
    }
}
