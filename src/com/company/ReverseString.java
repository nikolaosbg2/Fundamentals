package com.company;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String toBeReversed = scan.nextLine();
        String reversed = "";
        for (int i = toBeReversed.length()-1; i >=0 ; i--)
        {
            reversed=reversed+toBeReversed.charAt(i);
        }
        System.out.println(reversed);
    }
}
