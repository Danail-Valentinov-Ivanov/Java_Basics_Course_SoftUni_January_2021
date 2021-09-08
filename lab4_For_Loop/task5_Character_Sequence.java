package lab4_For_Loop;

import java.util.Scanner;

public class task5_Character_Sequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();

        for (int i = 0; i < x.length(); i++) {
            char letter = x.charAt(i);
            System.out.println(letter);
        }
    }
}
