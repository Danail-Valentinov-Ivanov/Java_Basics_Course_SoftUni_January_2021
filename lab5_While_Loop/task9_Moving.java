package lab5_While_Loop;

import java.util.Scanner;

public class task9_Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int sumBox = 0;
        //      int volumeBox = 0;
        int volumeApartment = width * length * height;

        while (!input.equals("Done")) {
            int numBox = Integer.parseInt(input);
            sumBox += numBox;
            if (sumBox >= volumeApartment) {
                System.out.printf("No more free space! You need %d Cubic" +
                        " meters more.", Math.abs(sumBox - volumeApartment));
                break;
            }
            input = scan.nextLine();
        }
        if (input.equals("Done")) {
            System.out.printf("%d Cubic meters left.", Math.abs(sumBox - volumeApartment));
        }

    }
}
