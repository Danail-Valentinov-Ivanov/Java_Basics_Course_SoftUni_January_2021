package ex2_Conditional_Statements;

import java.util.Scanner;

public class task7_World_Swimming_Record {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scan.nextLine());
        double distanceInMeters = Double.parseDouble(scan.nextLine());
        double timeInSecondsPerMeter = Double.parseDouble(scan.nextLine());

        double timeInSeconds = distanceInMeters * timeInSecondsPerMeter;
        double down = Math.floor(distanceInMeters / 15);
        double timeDelay = down * 12.5;
        double totalTime = timeInSeconds + timeDelay;
        if (totalTime >= recordInSeconds) {
            double difference = totalTime - recordInSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }
    }
}
