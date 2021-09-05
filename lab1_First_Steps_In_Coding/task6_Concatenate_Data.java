package lab1_First_Steps_In_Coding;

import java.util.Scanner;

public class task6_Concatenate_Data {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fName = scan.nextLine();
        String lName = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String town = scan.nextLine();

        System.out.println("You are " + fName + " " + lName + ", a " + age + "-years old person from " + town + ".");
    }
}
