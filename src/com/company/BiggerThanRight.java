package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class BiggerThanRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] arr = input.split(" ");
        int[] array = Arrays.stream(arr).mapToInt(e->Integer.parseInt(e)).toArray();
        int l = array.length-1;
        int m = 0;
        int pp = 1;
        boolean isBigger = false;

        for (int j = 0; j <array.length; j++)
        {
isBigger=true;
            for (int i = 1 + j; i < array.length; i++) {
                if (array[j] <= array[i]) {isBigger=false;}

        }
            if(isBigger){System.out.print(array[j] + " ");m=0;}
        }
    }
}
