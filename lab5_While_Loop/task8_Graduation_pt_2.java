package lab5_While_Loop;

import java.util.Scanner;

public class task8_Graduation_pt_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double sumGrade = 0;
        int classes = 1;
        int countBadGrade = 0;
        while (classes <= 12) {
            double grade = Double.parseDouble(scan.nextLine());
            if (grade < 4) {
                countBadGrade++;
            } else {
                classes++;
            }
            if (countBadGrade == 2) {
                System.out.printf("%s has been excluded at %d grade", name, classes);
                break;
            }
            sumGrade = sumGrade + grade;

        }
        if (classes == 13) {
System.out.printf("%s graduated. Average grade: %.2f", name, sumGrade / 12);
        }

    }
}
