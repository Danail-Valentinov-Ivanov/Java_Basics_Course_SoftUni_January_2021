package lab5_While_Loop;

import java.util.Scanner;

public class task4_Sequence_2k_plus_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int num = 1;
        while (num <= n) {
            System.out.println(num);
            num = 2 * num + 1;
        }
    }
}
