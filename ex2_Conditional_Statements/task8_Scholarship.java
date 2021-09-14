package ex2_Conditional_Statements;

import java.util.Scanner;

public class task8_Scholarship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        double averageGrade = Double.parseDouble(scan.nextLine());
        double minSalary = Double.parseDouble(scan.nextLine());
        double scholarshipSocial = 0;
        double scholarshipGrade = 0;
        boolean flag = false;

        if (budget < minSalary && averageGrade > 4.5) {
            scholarshipSocial = minSalary * 0.35;

        } else if (averageGrade >= 5.5) {
            scholarshipGrade = averageGrade * 25;

        } else if (budget >= minSalary || averageGrade <= 4.5) {
            flag = true;
            System.out.println("You cannot get a scholarship!");
        }
        if (scholarshipSocial >= scholarshipGrade && !flag) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(scholarshipSocial));
        } else if (scholarshipSocial < scholarshipGrade) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(scholarshipGrade));
        }
    }
}
