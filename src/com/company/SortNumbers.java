package com.company;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = Integer.parseInt(scan.nextLine());
        int number2 = Integer.parseInt(scan.nextLine());
        int number3 = Integer.parseInt(scan.nextLine());
        int max = 0;
        int mid = 0;
        int min = 0;

        if(number1>=number2&&number1>=number3){max = number1;}
        if(number2>=number1&&number2>=number3){max = number2;}
        if(number3>=number1&&number3>=number2){max = number3;}

        if(number1<=number2&&number1<=number3){min = number1;}
        if(number2<=number1&&number2<=number3){min = number2;}
        if(number3<=number1&&number3<=number2){min = number3;}

        if(max==number1&&min==number2){mid=number3;}
        if(max==number2&&min==number1){mid=number3;}

        if(max==number2&&min==number3){mid=number1;}
        if(max==number3&&min==number2){mid=number1;}

        if(max==number1&&min==number3){mid=number2;}
        if(max==number3&&min==number1){mid=number2;}

System.out.printf("%d%n%d%n%d",max,mid,min);
    }
}
