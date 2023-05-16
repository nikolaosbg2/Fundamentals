package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputLine = scan.nextLine();
        String[] arr = inputLine.split(" ");
        int[] array = Arrays.stream(arr).mapToInt(e -> Integer.parseInt(e)).toArray();
        int sumEven = 0;
        int sumOdd = 0;
        int differenceEvenOdd = 0;

            for (int number : array) {
                if (number % 2 == 0) {
                    sumEven += number;
                } else{sumOdd+=number;}
            }
            differenceEvenOdd=sumEven-sumOdd;
            System.out.println(differenceEvenOdd);
    }
}
