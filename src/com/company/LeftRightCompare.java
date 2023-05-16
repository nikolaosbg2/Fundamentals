package com.company;
import java.util.Scanner;

public class LeftRightCompare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int times = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < times; i++) {
            long numLeft = Long.parseLong(scan.next());
            long numRight = Long.parseLong(scan.next());;
            long sum = 0;
            if (numLeft > numRight){
                long LeftNum = numLeft;
                while (LeftNum != 0){
                    sum += Math.abs(LeftNum % 10);
                    LeftNum = Math.abs(LeftNum / 10);
                }
            }else{
                long RightNum = numRight;
                while (RightNum != 0){
                    sum += Math.abs(RightNum % 10);
                    RightNum =Math.abs(RightNum / 10);
                }
            }
            System.out.println(Math.abs(sum));
        }
    }
}


