package ex3_Conditional_Statements_Advanced;

import java.util.Scanner;

public class task9_Volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String kindYear = scan.nextLine();
        int numHoliday = Integer.parseInt(scan.nextLine());
        int numWeekendTraveling = Integer.parseInt(scan.nextLine());

        double numWeekendSofia = (48 - numWeekendTraveling) * 3.0 / 4;
        double numGamesHoliday = numHoliday * 2.0 / 3;
        double totalGames = numWeekendSofia + numWeekendTraveling + numGamesHoliday;

        if (kindYear.equals("leap")) {
            totalGames = totalGames * 1.15;
        }
        System.out.printf("%.0f", Math.floor(totalGames));
    }
}
