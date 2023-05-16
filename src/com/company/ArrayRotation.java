package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputLine = scan.nextLine();
        String[] array = inputLine.split(" ");
        int l = array.length;
        String m ="";
        //int[] arr = Arrays.stream(array).mapToInt(e -> Integer.parseInt(e)).toArray();
        int n = Integer.parseInt(scan.nextLine());
        int d = n;
        String result = "";
        String r ="";
        for (int i = 0; i < n; i++)
        {
            String store = array[0];
            for (int j = 0; j <array.length-1 ; j++)
            {
                array[j]=array[j+1];
            }
            array[l-1]=store;
        }
        System.out.println(String.join(" ",array));
    }
}
