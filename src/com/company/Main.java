package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
Scanner scan = new Scanner(System.in);
String name = scan.nextLine();
int age = Integer.parseInt(scan.nextLine());
double averageGrade = Double.parseDouble(scan.nextLine());
String result = String.format("Name: %s, Age: %d, Grade: %.2f", name,age,averageGrade);
System.out.println(result);
    }
}
