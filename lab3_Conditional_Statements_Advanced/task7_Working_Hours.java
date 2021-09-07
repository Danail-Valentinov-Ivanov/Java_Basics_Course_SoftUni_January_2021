package lab3_Conditional_Statements_Advanced;

import java.util.Scanner;

public class task7_Working_Hours {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();


        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (hour >= 10 && hour <= 18){
                    System.out.printf("open");
                } else {
                    System.out.printf("closed");
                }
                    break;
            case "Sunday":
                System.out.printf("closed");
                break;
        }

    }
}
