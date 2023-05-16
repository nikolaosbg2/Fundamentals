package com.company;

import java.util.Scanner;

public class FibonacciBackwards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int a = 1;
        int b = 1;
        int result = 0;
        int counter =2;
        while(counter!=n)
        {
            if(n==0){result=0;break;}
            if(n==1){result=1;break;}

            result=a+b;
            a=b;
            b=result;
            counter++;
        }
        if(n==2){result=1;}
     System.out.println(result);
    }
}
