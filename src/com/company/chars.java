package com.company;
import java.util.Scanner;

public class chars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = 'a';
        System.out.printf("The code of '%c' is: %d%n", ch, (int) ch);
        ch = 'b';
        System.out.printf("The code of '%c' is: %d%n", ch, (int) ch);
        ch = 'A';
        System.out.printf("The code of '%c' is: %d%n", ch, (int) ch);
        ch = 'щ'; // Cyrillic letter 'sht'
        System.out.printf("The code of '%c' is: %d%n", ch, (int) ch);
    }
}
