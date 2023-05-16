package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int a = Integer.parseInt(scan.nextLine());
String operator = scan.nextLine();
int b = Integer.parseInt(scan.nextLine());
double res = MathOperations(a,operator,b);
        System.out.printf(new DecimalFormat("0.##").format(res));
    }
    public static double MathOperations(int a, String operator, int b){
double result = 0;
switch (operator){
    case "*":
        result = a*b;
        break;
    case "/":
        result = a/b;
        break;
    case "-":
        result = a-b;
        break;
    case "+":
        result = a+b;
        break;
}
return result;
    }
}
