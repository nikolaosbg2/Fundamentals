package com.company;

import java.util.Scanner;

public class DivisibleByNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int biggestNum = 0;
        if(number%2==0){biggestNum=2;}
        if(number%3==0){biggestNum=3;}
        if(number%6==0){biggestNum=6;}
        if(number%7==0){biggestNum=7;}
        if(number%10==0){biggestNum=10;}
if(number%2!=0&&number%3!=0&&number%6!=0&&number%7!=0&&number%10!=0){System.out.println("Not divisible");return;}
System.out.printf("The number is divisible by %d",biggestNum);
    }
}
