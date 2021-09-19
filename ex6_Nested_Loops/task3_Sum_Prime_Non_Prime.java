package ex6_Nested_Loops;

import java.util.Scanner;

public class task3_Sum_Prime_Non_Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int sumAllPrimeNum = 0;
        int sumAllNonPrimeNum = 0;


        while (!input.equals("stop")) {
            boolean isPrime = true;
            int num = Integer.parseInt(input);
            if (num < 0) {
                System.out.println("Number is negative.");
                input = scan.nextLine();
                continue;
            }
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    sumAllNonPrimeNum += num;
                    break;
                }
            }
            if (isPrime) {
                sumAllPrimeNum += num;
            }
            input = scan.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n", sumAllPrimeNum);
        System.out.printf("Sum of all non prime numbers is: %d\n", sumAllNonPrimeNum);
    }
}
