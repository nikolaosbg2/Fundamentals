package com.company;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mid = scan.nextLine();
String result = middle(mid);
        System.out.println(result);
    }
    public static String middle(String mid){
      int l = mid.length();
      String str = "";
        if(l%2==0){str =String.valueOf(mid.charAt((l/2)-1)+"")+String.valueOf(mid.charAt((l/2))+"");}
        else {str = String.valueOf(mid.charAt((l/2))+"");}
        return str;
    }
}
