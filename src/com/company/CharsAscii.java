package com.company;

import java.util.Scanner;

public class CharsAscii {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int n = Integer.parseInt(scan.nextLine());
int sum = 0;
        for (int i = 1; i <=n ; i++)
        {
        char letters = scan.nextLine().charAt(0);
        sum+=(int)letters;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
