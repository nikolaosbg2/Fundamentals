package com.company;
import java.util.Scanner;

public class VowelsCountMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
int result = vowelsCount(input);
        System.out.println(result);
    }
    public static int vowelsCount(String input){
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='a'||input.charAt(i)=='A'||input.charAt(i)=='e'||input.charAt(i)=='E'||input.charAt(i)=='o'||input.charAt(i)=='O'||input.charAt(i)=='u'||input.charAt(i)=='U'||input.charAt(i)=='i'||input.charAt(i)=='I') {
           counter++;}
            }
        return counter;
        }
}
