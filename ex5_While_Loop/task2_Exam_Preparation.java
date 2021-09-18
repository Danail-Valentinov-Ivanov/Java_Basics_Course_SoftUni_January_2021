package ex5_While_Loop;

import java.util.Scanner;

public class task2_Exam_Preparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numBadGrade = Integer.parseInt(scan.nextLine());
        String task = scan.nextLine();
        int countBadGrade = 0;
        double sumGrade = 0;
        int countProblems = 0;
        String lastProblem = "";

        while (!task.equals("Enough")) {
            double grade = Double.parseDouble(scan.nextLine());
            if (grade <= 4) {
                countBadGrade++;
            }
            if (countBadGrade == numBadGrade){
                break;
            }
            sumGrade += grade;
            lastProblem = task;
            task = scan.nextLine();
            countProblems++;
        }
        if (task.equals("Enough")){
            System.out.printf("Average score: %.2f\n", sumGrade / countProblems);
            System.out.printf("Number of problems: %d\n", countProblems);
            System.out.printf("Last problem: %s", lastProblem);
        } else {
            System.out.printf("You need a break, %d poor grades.", countBadGrade);
        }
    }
}
