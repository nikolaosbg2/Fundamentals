package com.company;
import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int p = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int initialLiftsRemainder = n%p;
        int initialLifts = n/p;
        if(p>=n){sum=1;}
else if(p<n)
{
    if(initialLiftsRemainder==0){sum=initialLifts;}
    else {sum=initialLifts+1;}
}
System.out.println(sum);
    }
}
