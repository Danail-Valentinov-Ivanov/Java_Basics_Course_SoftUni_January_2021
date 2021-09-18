package ex5_While_Loop;

import java.util.Scanner;

public class task4_Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int goal = 10000;
        int totalSteps = 0;

        while (totalSteps < goal) {
            String input = scan.nextLine();

            if (input.equals("Going home")) {
                int stepsToHome = Integer.parseInt(scan.nextLine());
                totalSteps += stepsToHome;
                break;
            }

            int currentSteps = Integer.parseInt(input);
            totalSteps += currentSteps;
        }
        if (totalSteps >= goal) {
            System.out.printf("Goal reached! Good job!\n" +
                    "%d steps over the goal!", Math.abs(totalSteps-goal));
        } else {
            System.out.printf("%d more steps to reach goal.", Math.abs(totalSteps-goal));
        }
    }

}