package ex5_While_Loop;

import java.util.Scanner;

public class task1_Old_Books {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String searchBook = scan.nextLine();
        String currentBook = scan.nextLine();
        int count = 0;

        while (!currentBook.equals(searchBook)) {
            if (currentBook.equals("No More Books")) {

                break;
            }
            currentBook = scan.nextLine();
            count++;
        }
        if (currentBook.equals(searchBook)) {
            System.out.printf("You checked %d books and found it.", count);
        } else {
            System.out.printf("The book you search is not here!\n" +
                    "You checked %d books.", count);
        }
    }
}
