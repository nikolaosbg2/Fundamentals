package com.company;
import java.util.Scanner;

public class NumbersOperations1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());
        int number3 = Integer.parseInt(scan.nextLine());
        int number4 = Integer.parseInt(scan.nextLine());
int addFirstToSecond = number1+number2;
int divideByTheThird = addFirstToSecond/number3;
int result = divideByTheThird*number4;
System.out.println(result);
    }
}
