package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input1 = scan.nextLine();
        String input2 = scan.nextLine();

        String[] arr1 = input1.split(" ");
        String[] arr2 = input2.split(" ");

        String common = "";
        String comtotal ="";

        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
if(arr1[i].equals(arr2[j])){common+=arr2[j]+" ";}
            }
        }
        String[] com =common.split(" ");
        for (int i = 0; i < arr2.length; i++)
        {
            for (int j = 0; j < com.length; j++)
            {
                if(arr2[i].equals(com[j])){comtotal+=arr2[i]+" ";}
            }
        }
        System.out.println(comtotal);
    }
}
