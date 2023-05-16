package com.company;
import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
double res = factorialDivision(a,b);
        System.out.printf("%.2f",res);
    }
    public static double factorialDivision(double a, double b){
       double factA = 1;
       double factB = 1;

        for (double i = a; i >=1 ; i--) {
            factA=factA*i;
        }
        for (double j = b; j >=1 ; j--) {
            factB=factB*j;
        }
        double result = factA/factB;
        return result;
    }
}
