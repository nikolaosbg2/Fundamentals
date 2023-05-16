package com.company;
import java.util.Scanner;

public class RangePrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int endInterval = Integer.parseInt(scan.nextLine());
        for (int i = 2; i <= endInterval; i++)
        {
            boolean isPrime = true;
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0) { isPrime = false; break;}
            }
            System.out.printf("%d -> %b%n", i, isPrime);
        }
    }
}
