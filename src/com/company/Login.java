package com.company;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        String password = "";
        int counter = 0;
        for (int i = username.length() - 1; i >= 0; i--) {
            password = password + username.charAt(i);
        }
        String attempt = scan.nextLine();
        while (!attempt.equals(password)) {
            counter++;
            if (counter > 3) {
                System.out.printf("%nUser %s blocked!", username);
                return;
            }
            System.out.printf("%nIncorrect password. Try again.");
            attempt = scan.nextLine();
        }
        if (attempt.equals(password)) {
            System.out.printf("%nUser %s logged in.", username);
        }
    }
}
