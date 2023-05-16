package com.company;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputLine = scan.nextLine();
        if (isValid1(inputLine) && isValid2(inputLine) && isValid3(inputLine)) {
            System.out.println("Password is valid");}
        if(!isValid1(inputLine)){System.out.println("Password must be between 6 and 10 characters");}
        if(!isValid2(inputLine)){ System.out.println("Password must consist only of letters and digits");}
if (!isValid3(inputLine)) {System.out.println("Password must have at least 2 digits");}

    }
    public static boolean isValid1(String input){
        int characterCount = 0;
        boolean flag = false;
        if(input.length()<6||input.length()>10){
            flag=false;}
        else {flag = true;}
        return flag;
        }
        public static boolean isValid2(String input) {
            boolean flag2 = false;
            int counter = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) >= 48 && input.charAt(i) <= 57 || input.charAt(i) >= 65 && input.charAt(i) <= 90 || input.charAt(i) >= 97 && input.charAt(i) <= 122) {
                    counter++;
                }
                if(counter==input.length()){flag2=true;}
                else {flag2=false;}

            }
            return flag2;
        }
    public static boolean isValid3(String input) {
        boolean flag3 = false;
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if ((int)input.charAt(i) >= 48 && (int)input.charAt(i) <= 57) {
                counter++;
            }
        }
        if (counter < 2) {

            flag3 = false;
        } else {
             flag3 = true;
        }
        return flag3;
    }

}
