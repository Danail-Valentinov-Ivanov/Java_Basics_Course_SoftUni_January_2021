package ex6_Nested_Loops;

import java.util.Scanner;

public class task2_2_Equal_Sums_Even_Odd_Position {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());

        for (int num = firstNum; num <= secondNum; num++) {
            int evenSum = 0;
            int oddSum = 0;
            int i = num;
            for (int j = 6; j >= 0; j--) {
                int currentDigit = i % 10;
                i /= 10;
                if (j % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
                }
                if (oddSum == evenSum) {
                    System.out.print(num + " ");
                }
            }
        }
    }
