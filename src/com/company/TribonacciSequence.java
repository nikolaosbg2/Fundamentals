package com.company;
import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
TribonacciSequence(num);
    }
    public static void TribonacciSequence(int num){
        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber = 2;
        int nextElement = 0;
        int counter = 4;
        if(num==1){System.out.print(firstNumber);}
        else if(num==2){System.out.print(firstNumber+" ");System.out.print(secondNumber);}
        else if(num==3){System.out.print(firstNumber+" ");System.out.print(secondNumber+" ");System.out.print(thirdNumber);}
        else {
            System.out.print(firstNumber+" ");System.out.print(secondNumber+" ");System.out.print(thirdNumber+" ");

            while (counter!=num+1) {
nextElement=firstNumber+secondNumber+thirdNumber;

            System.out.print(nextElement+" ");
firstNumber=secondNumber;secondNumber=thirdNumber;thirdNumber=nextElement;
counter++;
        }}
    }
}
