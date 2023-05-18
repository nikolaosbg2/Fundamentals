package com.company;

import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        String result = binary(number);
        System.out.println(result);
    }

    public static String binary(int number) {
        String binary = "";
        if (number == 0) {
            return "0";
        } else {
            for (int i = number; i > 0; i /= 2) {
binary=(i%2)+binary;
            }
            return binary;
        }

    }

}
