package com.company;
import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int key = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());
        String message = "";
        for (int i = 1; i <= n; i++)
        {
            char letters = scan.next().charAt(0);
            message+=(char)(letters+key)+"";
        }
System.out.println(message);
    }
}
