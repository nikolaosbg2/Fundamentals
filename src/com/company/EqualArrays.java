package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputLine1 = scan.nextLine();
        String inputLine2 = scan.nextLine();

        String[] inp1 = inputLine1.split(" ");
        String[] inp2 = inputLine2.split(" ");

        int[] arr1 = Arrays.stream(inp1).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] arr2 = Arrays.stream(inp2).mapToInt(r -> Integer.parseInt(r)).toArray();

int sum = 0;
        for (int i = 0; i < arr1.length; i++)
        {
            if(arr1[i]!=arr2[i]){System.out.printf("Arrays are not identical. Found difference at %d index.",i);return;}
            else {sum+=arr1[i];}
        }
        System.out.printf("Arrays are identical. Sum: %d",sum);
    }
}
