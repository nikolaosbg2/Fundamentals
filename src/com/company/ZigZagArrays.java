package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sum1 = "";
        String sum2 = "";
        int counter =0;
        boolean flag = true;
        boolean fl = true;
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <=n; i++)
        {
            String array = scan.nextLine();
            String[] arr1 = array.split(" ");
           if(flag){sum1 += (arr1[0]+" ");flag=false;}
           else {sum1 += (arr1[1]+" ");flag=true;}
            if(fl){sum2 += (arr1[1]+" ");fl=false;}
            else {sum2 += (arr1[0]+" ");fl=true;}
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
