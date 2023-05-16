package com.company;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double total = 0;
        for (int i = 1; i <=n ; i++)
        {
            double pricePerCapsule = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            int capsulesCount = Integer.parseInt(scan.nextLine());
            double result = ((days*capsulesCount)*1.0*pricePerCapsule);
            total+=result;
            System.out.printf("The price for the coffee is: $%.2f%n",result);
        }
System.out.printf("Total: $%.2f",total);
    }
}
