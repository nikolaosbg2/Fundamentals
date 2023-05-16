package com.company;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
int smallest = sdmallesOfThreeNumbers(a,b,c);
        System.out.println(smallest);
    }
    public static int sdmallesOfThreeNumbers(int a, int b, int c){
        int smallestNum = 0;
        smallestNum = Math.min(c,Math.min(a,b));

        return smallestNum;
    }
}
