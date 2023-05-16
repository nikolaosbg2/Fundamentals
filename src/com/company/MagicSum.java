package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputLine = scan.nextLine();
        String[] arr = inputLine.split(" ");
        int[] array = Arrays.stream(arr).mapToInt(e -> Integer.parseInt(e)).toArray();
        int number = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < array.length; i++)
        {
            for (int j = i +1; j < array.length; j++)
            {
                   if ((array[i] + array[j]) == number) {
                       System.out.printf("%d %d%n", array[i], array[j]);
                   }
            }
        }
    }
}
