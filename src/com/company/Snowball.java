package com.company;
import java.util.Scanner;

public class Snowball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double highestValue = 0;
        double highestSnow = 0;
        double highestTime = 0;
        double highestQuality = 0;
        int N = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <=N ; i++)
        {
            int snowballSnow = Integer.parseInt(scan.nextLine());
            int snowballTime = Integer.parseInt(scan.nextLine());
            int snowballQuality = Integer.parseInt(scan.nextLine());

            double snowballValue = Math.pow((snowballSnow/snowballTime),snowballQuality);
            if(snowballValue>highestValue){highestValue=snowballValue;highestSnow=snowballSnow;highestTime=snowballTime;highestQuality=snowballQuality;}
        }
        System.out.printf("%.0f : %.0f = %.0f (%.0f)",highestSnow,highestTime,highestValue,highestQuality);
    }
}
