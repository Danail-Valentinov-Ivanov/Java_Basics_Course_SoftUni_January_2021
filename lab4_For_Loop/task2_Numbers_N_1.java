package lab4_For_Loop;

import java.util.Scanner;

public class task2_Numbers_N_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int y = Integer.parseInt(scan.nextLine());
        for (int i = y; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
