package com.company;
import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char character = scan.next().charAt(0);
        if((int)character>=65&&(int)character<=90){System.out.println("upper-case");}
        if((int)character>=97&&(int)character<=122){System.out.println("lower-case");}
    }
}
