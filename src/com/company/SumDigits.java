package com.company;
import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int num = 0;
        while(number>0)
        {
            num+=number%10;
            number=number/10;
        }
        System.out.println(num);
    }
}
