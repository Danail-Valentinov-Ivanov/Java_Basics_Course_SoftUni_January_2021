package ex2_Conditional_Statements;

import java.util.Scanner;

public class task5_Time_plus_15_Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = Integer.parseInt(scan.nextLine());
        int min = Integer.parseInt(scan.nextLine());
        int totalTimeInMin = hour * 60 + min + 15;

        hour = totalTimeInMin / 60;
        min = totalTimeInMin % 60;

        if (hour > 23) {
            hour = 0;
        }
        System.out.printf("%d:%02d", hour, min);
        }
    }
