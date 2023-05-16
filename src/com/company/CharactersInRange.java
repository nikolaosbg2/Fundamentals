package com.company;
import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char firstCharacter = scan.next().charAt(0);
        char secondCharacter = scan.next().charAt(0);
        char t ='a';
        if((int)firstCharacter>(int)secondCharacter){t=firstCharacter;firstCharacter=secondCharacter;secondCharacter=t;}

charactersInRange(firstCharacter,secondCharacter);
    }
    public static void charactersInRange(char a, char b){

            for (int i = a + 1; i < b; i++) {
                System.out.print((char) i + " ");
            }

        }

}
