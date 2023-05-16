package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputLine = scan.nextLine();
        String[] arr = inputLine.split(" ");
        int[] array = Arrays.stream(arr).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[]cond = new int[array.length-1];
        if(array.length==1){System.out.println(array[0]);return;}
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < cond.length-i; j++)
            {
                cond[j]=array[j]+array[j+1];
            }
            array = cond;
        }
        System.out.println(cond[0]);
    }
}
