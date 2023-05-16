package com.company;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double validCoinsSum = 0;
        String input = scan.nextLine();
        while(!input.equals("Start"))
        {
            double coins = Double.parseDouble(input);
            if(coins==0.1||coins==0.2||coins==0.5||coins==1||coins==2){validCoinsSum+=coins;}
            else {System.out.printf("Cannot accept %.2f%n",coins);}
            input=scan.nextLine();
        }
        if(input.equals("Start"))
        {
            String products = scan.nextLine();
            while(!products.equals("End"))
            {
                if (products.equals("Nuts")) {if(validCoinsSum>=2.0){validCoinsSum -= 2.0;System.out.printf("Purchased %s%n",products);}else {System.out.println("Sorry, not enough money");}}
                else if (products.equals("Water")) {if(validCoinsSum>=0.7){validCoinsSum -= 0.7;System.out.printf("Purchased %s%n",products);}else {System.out.println("Sorry, not enough money");}}
                else  if (products.equals("Crisps")) {if(validCoinsSum>=1.5){validCoinsSum -= 1.5;System.out.printf("Purchased %s%n",products);}else {System.out.println("Sorry, not enough money");}}
                else if (products.equals("Soda")) {if(validCoinsSum>=0.8){validCoinsSum -= 0.8;System.out.printf("Purchased %s%n",products);}else {System.out.println("Sorry, not enough money");}}
                else if (products.equals("Coke")) {if(validCoinsSum>=1.0){validCoinsSum -= 1.0;System.out.printf("Purchased %s%n",products);}else {System.out.println("Sorry, not enough money");}}
                else {System.out.println("Invalid product");}
                products=scan.nextLine();
            }
            if(products.equals("End")){System.out.printf("Change: %.2f",validCoinsSum);}
        }
    }
}
