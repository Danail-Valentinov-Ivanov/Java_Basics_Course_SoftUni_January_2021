package ex3_Conditional_Statements_Advanced;

import java.util.Scanner;

public class task8_On_Time_for_the_Exam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hourExam = Integer.parseInt(scan.nextLine());
        int minExam = Integer.parseInt(scan.nextLine());
        int hourComing = Integer.parseInt(scan.nextLine());
        int minComing = Integer.parseInt(scan.nextLine());

        int timeExam = hourExam * 60 + minExam;
        int timeComing = hourComing * 60 + minComing;
        String output = "";
        String output2 = "";
        int diff = 0;

        if (timeComing >= timeExam - 30 && timeComing <= timeExam) {
            output = "On time";
            diff = Math.abs(timeComing - timeExam);
            int hours = diff / 60;
            int min = diff % 60;
            if (diff < 60) {
                output2 = String.format("On time %d minutes before the start", diff);
            } else {
                output2 = String.format("On time %d:%02d hours before the start", hours, min);
            }
        } else if (timeComing < timeExam - 30) {
            output = "Early";
            diff = Math.abs(timeComing - timeExam);
            int hours = diff / 60;
            int min = diff % 60;
            if (diff < 60) {
                output2 = String.format("Early %d minutes before the start", diff);
            } else {
                output2 = String.format("Early %d:%02d hours before the start", hours, min);
            }
        } else if (timeComing > timeExam) {
            output = "Late";
            diff = Math.abs(timeComing - timeExam);
            int hours = diff / 60;
            int min = diff % 60;
            if (diff < 60) {
                output2 = String.format("Late %d minutes after the start", diff);
            } else {
                output2 = String.format("Late %d:%02d hours after the start", hours, min);
            }
        }
        System.out.println(output);
        System.out.println(output2);
    }
}
