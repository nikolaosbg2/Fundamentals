package com.company;
import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
double grade = Double.parseDouble(scan.nextLine());
if(grade>2.99){System.out.println("Passed!");}
else {System.out.println("Failed!");}
    }
}
