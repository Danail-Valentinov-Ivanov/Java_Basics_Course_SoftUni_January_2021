package ex4_For_Loop;

import java.util.Scanner;

public class task6_Salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabs = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());


        for (int i = 1; i <= tabs; i++) {
            String readTabs = scan.nextLine();

            if (readTabs.equals("Facebook")) {
                salary -= 150;
            } else if (readTabs.equals("Instagram")) {
                salary -= 100;
            } else if (readTabs.equals("Reddit")) {
                salary -= 50;
            }


        }
        if (salary <= 0) {
            System.out.println("You have lost your salary.");

        }
        if (salary > 0) {
            System.out.println(salary);
        }
    }
}
