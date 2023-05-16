package com.company;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = Double.parseDouble(scan.nextLine());
        double result = num*1.36;
        System.out.printf("%.3f",result);
    }
}
