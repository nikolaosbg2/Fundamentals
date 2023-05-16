package com.company;
import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputLine  = scan.nextLine();
        System.out.println();
        while(!inputLine.equals("END")){
            int n = Integer.parseInt(inputLine);
            System.out.println(isPalindrome(n));
            inputLine=scan.nextLine();
        }
    }
    public static boolean isPalindrome(int number){
        boolean flag =  false;
        String numToString = String.valueOf(number);
        String reverse = "";
        for (int i = numToString.length()-1; i >= 0; i--) {
            reverse+=numToString.charAt(i);
        }
        if(reverse.equals(numToString)){flag=true;}
        else {flag=false;}
        return flag;
    }
}
