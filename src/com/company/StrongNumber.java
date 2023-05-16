package com.company;
import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        String num = String.valueOf(number);
int sum = 1;
int totalSum = 0;
int oneNum = 0;
        for (int i = 0; i < num.length(); i++)
        {
           oneNum=Integer.parseInt(num.charAt(i)+"");
            for (int j = 1; j <=oneNum ; j++)
            {
                sum*=j;
            }
            totalSum+=sum;sum=1;
        }
if(totalSum==number){System.out.println("yes");}
else {System.out.println("no");}
    }
}
