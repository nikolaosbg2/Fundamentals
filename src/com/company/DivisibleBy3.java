package com.company;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int r = 1;
        for (int i = 0; i < n ; i++)
        {
            if(r%2!=0){System.out.println(r);sum+=r;}
            r+=2;
        }
        System.out.printf("Sum: %d",sum);
    }
}
