package com.company;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int multiplier = Integer.parseInt(scan.nextLine());
        if(multiplier<=10) {
            for (int i = multiplier; i <= 10; i++)
            {
                int product = number * i;
                String tableForm = String.format("%d X %d = %d", number, i, product);
                System.out.println(tableForm);
            }
        }
        else
        {
            int product = number * multiplier;
            String tableForm = String.format("%d X %d = %d", number, multiplier, product);
            System.out.println(tableForm);
        }
    }
}
