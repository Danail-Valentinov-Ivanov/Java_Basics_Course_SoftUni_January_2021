package lab6_Nested_Loops;

import java.util.Scanner;

public class task6_Building {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numFloors = Integer.parseInt(scan.nextLine());
        int numRooms = Integer.parseInt(scan.nextLine());
        String tip = "";
        for (int i = numFloors; i > 0; i--) {
            if (i == numFloors){
                tip = "L";
            } else if (i % 2 == 0) {
                tip = "O";
            } else {
                tip = "A";
            }


            for (int j = 0; j < numRooms; j++) {

                System.out.printf("%s%d%d ", tip, i, j);

            }
            System.out.println();
        }
    }
}
