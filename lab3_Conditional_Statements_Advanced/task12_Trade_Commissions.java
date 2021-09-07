package lab3_Conditional_Statements_Advanced;

import java.util.Scanner;

public class task12_Trade_Commissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine();
        double sales = Double.parseDouble(scan.nextLine());
        double commission = 0;

        switch (city) {
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    commission = sales * 0.05;
                    System.out.printf("%.2f", commission);
                } else if (sales > 500 && sales <= 1000) {
                    commission = sales * 0.07;
                    System.out.printf("%.2f", commission);
                } else if (sales > 1000 && sales <= 10000) {
                    commission = sales * 0.08;
                    System.out.printf("%.2f", commission);
                } else if (sales > 10000) {
                    commission = sales * 0.12;
                    System.out.printf("%.2f", commission);
                } else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    commission = sales * 0.045;
                    System.out.printf("%.2f", commission);
                } else if (sales > 500 && sales <= 1000) {
                    commission = sales * 0.075;
                    System.out.printf("%.2f", commission);
                } else if (sales > 1000 && sales <= 10000) {
                    commission = sales * 0.10;
                    System.out.printf("%.2f", commission);
                } else if (sales > 10000) {
                    commission = sales * 0.13;
                    System.out.printf("%.2f", commission);
                } else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    commission = sales * 0.055;
                    System.out.printf("%.2f", commission);
                } else if (sales > 500 && sales <= 1000) {
                    commission = sales * 0.08;
                    System.out.printf("%.2f", commission);
                } else if (sales > 1000 && sales <= 10000) {
                    commission = sales * 0.12;
                    System.out.printf("%.2f", commission);
                } else if (sales > 10000) {
                    commission = sales * 0.145;
                    System.out.printf("%.2f", commission);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;

        }
    }
}
