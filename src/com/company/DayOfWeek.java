package com.company;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int number = Integer.parseInt(scan.nextLine());
        if(number-1>6||number-1<0){System.out.println("Invalid day!");}
        else System.out.println(daysOfWeek[number-1]);
    }
}
