package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        String result ="";
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(scan.nextLine());
        }
        for (int j = 0; j < arr.length; j++)
        {
            sum+=arr[j];
            result+=arr[j]+" ";
        }
        System.out.print(result);
        System.out.println();
        System.out.println(sum);
    }
}
