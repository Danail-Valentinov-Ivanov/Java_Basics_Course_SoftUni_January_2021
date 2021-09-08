package lab4_For_Loop;

import java.util.Scanner;

public class task3_Numbers_1_N_with_Step_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= y; i += 3) {
            System.out.println(i);
        }
    }
}
