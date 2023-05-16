package com.company;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = Long.parseLong(scan.nextLine());
        long formula = 1;
        if(n==0){System.out.print("1");return;}
        if(n>60){return;}
        for (long i = 0; i <= n-1; i++) {
           if(i>0){ System.out.println();}
            for (long r = 0; r < i; r++) {
                long nFactorial = 1;

                for (long j = 1; j <= i; j++) {
                    nFactorial = nFactorial * j;
                }
                long rFactorial = 1;

                for (long j = 1; j <= r; j++) {
                    rFactorial = rFactorial * j;
                }
                long nminusrFactorial = 1;

                for (long j = 1; j <= (i - r); j++) {
                    nminusrFactorial = nminusrFactorial * j;
                }
                if(nFactorial==0){nFactorial=1;}
                if(rFactorial==0){rFactorial=1;}
                if(nminusrFactorial==0){nminusrFactorial=1;}
                if(r==0||i==0){ formula = 1;}
                else {
                 formula = (nFactorial / (rFactorial * nminusrFactorial));}
                System.out.print(formula+" ");

            }

            System.out.print("1");
        }
    }
}
