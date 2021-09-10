package lab6_Nested_Loops;

import java.util.Scanner;

public class task7_Cinema_Tickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countAllTickets = 0;
        int countStudentTickets = 0;
        int countStandardTickets = 0;
        int countKidTickets = 0;
        while (true) {
            String movie = scan.nextLine();
            if (movie.equals("Finish")) {
                break;
            }
            int capacity = Integer.parseInt(scan.nextLine());

            int countAllOneTicket = 0;
            int countFreeSeats = capacity;
            while (countFreeSeats > 0) {
                String type = scan.nextLine();

                if (type.equals("End")) {
                    break;
                }
                switch (type) {
                    case "student":
                        countStudentTickets++;
                        break;
                    case "standard":
                        countStandardTickets++;
                        break;
                    case "kid":
                        countKidTickets++;
                        break;
                }
                countFreeSeats--;
                countAllOneTicket++;
            }
            countAllTickets += countAllOneTicket;
            double percentTakeSeats = (countAllOneTicket * 1.0 / capacity) * 100;
            System.out.printf("%s - %.2f%% full.\n", movie, percentTakeSeats);
        }
        System.out.printf("Total tickets: %d\n", countAllTickets);
        System.out.printf("%.2f%% student tickets.\n", (countStudentTickets * 1.0 / countAllTickets * 100));
        System.out.printf("%.2f%% standard tickets.\n", (countStandardTickets * 1.0 / countAllTickets * 100));
        System.out.printf("%.2f%% kids tickets.\n", (countKidTickets * 1.0 / countAllTickets * 100));
    }
}
