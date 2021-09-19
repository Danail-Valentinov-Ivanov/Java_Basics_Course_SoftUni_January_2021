package ex6_Nested_Loops;

import java.util.Scanner;

public class task4_Train_The_Trainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numJudge = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        double sumAllGrade = 0;
        int countNumGrade = 0;

        while (!input.equals("Finish")) {
            double sumGrade = 0;


            for (int i = 1; i <= numJudge; i++) {
                double grade = Double.parseDouble(scan.nextLine());
                sumGrade += grade;
                countNumGrade++;
            }
            sumAllGrade += sumGrade;
            System.out.printf("%s - %.2f.\n", input, sumGrade / numJudge);
            input = scan.nextLine();

        }
        System.out.printf("Student's final assessment is %.2f.", sumAllGrade / countNumGrade);

    }
}
