package com.company;
import java.util.Scanner;
import java.math.BigDecimal;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        BigDecimal sum = new BigDecimal(0);
        for (int i = 1; i <=n ; i++)
        {
            BigDecimal toAdd = new BigDecimal(scan.nextLine());
            sum = sum.add(toAdd);
        }
System.out.println(sum);
    }
}
