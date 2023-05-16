package com.company;
import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a =Integer.parseInt(scan.nextLine());
        int b =Integer.parseInt(scan.nextLine());
        int c =Integer.parseInt(scan.nextLine());
        sign(a,b,c);
    }
    public static void sign(int a, int b, int c){
        if(a<0&&b>0&&c>0){System.out.println("negative");}
            else if(a>0&&b<0&&c>0){System.out.println("negative");}
               else if(a>0&&b>0&&c<0){System.out.println("negative");}
        else if(a>0&&b<0&&c<0){System.out.println("positive");}
        else if(a<0&&b>0&&c<0){System.out.println("positive");}
        else if(a<0&&b<0&&c>0){System.out.println("positive");}
        else if(a<0&&b<0&&c<0){System.out.println("negative");}
        else if(a>0&&b>0&&c>0){System.out.println("positive");}
        else if(a==0||b==0||c==0){System.out.println("zero");}
        }
}
