package com.company;
import java.util.Scanner;

public class Triples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 'a'; i <'a'+n ; i++)
        {
            for (int j = 'a'; j <'a'+n; j++)
            {
                for (int k = 'a'; k <'a'+n ; k++)
                {
                    System.out.printf("%s%s%s%n",(char)i,(char)j,(char)k);
                }
            }
        }
    }
}
