package com.company;
import java.util.Scanner;

public class Brackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int counter1 = 0;
        int counter2 = 0;
        boolean flag = false;
        boolean fl = false;
        for (int i = 1; i <=n ; i++) {
            String br = scan.nextLine();
            if (br.equals("(")) {
                flag = true;
                counter1++;
            }
                if (br.equals(")")) {
                    flag = false;
                    counter2++;
                    if(counter1-counter2!=0){System.out.println("UNBALANCED");return;}
                }
            }
            if (counter1==counter2) {
                System.out.println("BALANCED");
            }
           else {
                System.out.println("UNBALANCED");
            }
        }
}
