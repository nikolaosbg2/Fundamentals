package com.company;
import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        matrix(n);
    }
    public static void matrix(int number){
        if(number==0){System.out.print(number);}
        for (int i = 0; i <number ; i++) {
            if(i>0){System.out.println();}
            for (int j = 0; j <number ; j++) {
                System.out.print(number+" ");
            }
        }
    }
}
