package lab4_For_Loop;

import java.util.Scanner;

public class task6_Vowels_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String x = scan.nextLine();

        int sum = 0;
        for (int i = 0; i < x.length(); i++) {
            char letter = x.charAt(i);
            switch (letter) {
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }
        }
        System.out.println(sum);
    }
}
