package com.company;
import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numberA = Double.parseDouble(scan.nextLine());
        double numberB = Double.parseDouble(scan.nextLine());
        double diff = 0.000001;
        double actDiff = Math.abs(numberA-numberB);
        if(diff>=actDiff){System.out.println("True");}
        else {System.out.println("False");}
    }
}
