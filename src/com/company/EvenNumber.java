package com.company;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        while(result==0)
        {
            int number = Integer.parseInt(scan.nextLine());
            if(number%2!=0){
            System.out.println("Please write an even number.");}
            else {result=Math.abs(number);System.out.printf("The number is: %d",result);break;}
        }
    }
}
