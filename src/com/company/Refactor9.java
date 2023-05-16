package com.company;
import java.util.Scanner;

public class Refactor9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int total = 0;
        int num = 0;
        String tr = "True";
        String fl = "False";
        String bool  =  "";
        boolean isSpecialNumber = false;
        for (int i = 1; i <= number; i++) {
            num = i;
            while (num > 0)
            {
                total += num % 10;
                num = num / 10;
            }
            isSpecialNumber = (total == 5) || (total == 7) || (total == 11);if(isSpecialNumber){bool=tr;}else {bool=fl;} System.out.printf("%d -> %s%n", i, bool);
            total = 0;
        }
    }
}
