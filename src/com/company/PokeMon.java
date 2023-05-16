package com.company;
import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine());
        int M = Integer.parseInt(scan.nextLine());
        int Y = Integer.parseInt(scan.nextLine());
        double NOriginal = N;
        int targetsCount = 0;
while(N>=M)
{
    N-=M;targetsCount++;
    if(N*1.00==0.50*NOriginal&&Y!=0){N/=Y;}
}
System.out.printf("%d%n%d",N,targetsCount);
    }
}
