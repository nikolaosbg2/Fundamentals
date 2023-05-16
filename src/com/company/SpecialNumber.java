package com.company;
import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String num = "";
        String tr = "True";
        String fl = "False";
        String bool = "";
        int sum = 0;
        for (int i = 1; i <=n ; i++)
        {
            num = String.valueOf(i);
            if(i<=9){sum=i;}
            else if(i>9)
            {
                for (int j = 0; j < num.length(); j++)
                {
                    sum+=Integer.parseInt(num.charAt(j)+"");
                }
            }
            if(sum==5||sum==7||sum==11){bool=tr;}
            else {bool=fl;}
            System.out.printf("%d -> %s%n",i,bool);sum=0;
        }
    }
}
