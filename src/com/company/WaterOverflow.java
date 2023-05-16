package com.company;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tankLiters = 255;
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <=n ; i++)
        {
         int quantities = Integer.parseInt(scan.nextLine());
         if(tankLiters>=quantities){tankLiters-=quantities;}
         else {System.out.println("Insufficient capacity!");}
        }
        System.out.println(255-tankLiters);
    }
}
