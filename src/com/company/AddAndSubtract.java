package com.company;
import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int a =  Integer.parseInt(scan.nextLine());
        int b =  Integer.parseInt(scan.nextLine());
        int c =  Integer.parseInt(scan.nextLine());
int result = subtract(sum(a,b),c);
        System.out.println(result);
    }
    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static int subtract(int sum,int c){
        int subtract = sum-c;
        return subtract;
    }
}
