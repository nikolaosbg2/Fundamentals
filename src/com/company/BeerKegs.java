package com.company;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double max = 0;
        String biggestKeg = "";
        for (int i = 1; i <=n ; i++)
        {
            String kegModel = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            double height = Double.parseDouble(scan.nextLine());
            double volume = Math.PI*Math.pow(radius,2)*height;
            if(volume>max){max=volume;biggestKeg=kegModel;}
        }
        System.out.println(biggestKeg);
    }
}
