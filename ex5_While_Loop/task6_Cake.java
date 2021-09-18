package ex5_While_Loop;

import java.util.Scanner;

public class task6_Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int allPieces = width * length;
        int sumPieces = 0;

        while (!input.equals("STOP")) {
            int numPieces = Integer.parseInt(input);
            sumPieces = sumPieces + numPieces;
            if (sumPieces >= allPieces) {
                System.out.printf("No more cake left!" +
                        " You need %d pieces more.", Math.abs(sumPieces - allPieces));
                break;
            }
            input = scan.nextLine();
        }
        if (input.equals("STOP")) {
            System.out.printf("%d pieces are left.", Math.abs(sumPieces - allPieces));
        }
    }
}
