package lab4_For_Loop;

import java.util.Scanner;

public class task7_Sum_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int y = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 0; i < y; i++) {
            int num = Integer.parseInt(scan.nextLine());
            sum = sum + num;
        } System.out.println(sum);
    }
}
