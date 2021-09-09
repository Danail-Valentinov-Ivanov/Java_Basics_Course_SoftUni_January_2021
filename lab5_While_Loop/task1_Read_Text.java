package lab5_While_Loop;

import java.util.Scanner;

public class task1_Read_Text {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        while (!input.equals("Stop")) {
            System.out.println(input);
            input = scan.nextLine();
        }
        }
    }
