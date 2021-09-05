package lab1_First_Steps_In_Coding;

import java.util.Scanner;

public class task5_Greeting_by_Name {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.printf("Hello, %s!", name);
    }
}
