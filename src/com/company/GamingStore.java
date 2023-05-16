package com.company;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double currentBalance = Double.parseDouble(scan.nextLine());
        double total = currentBalance;
        String games = scan.nextLine();
        while(!games.equals("Game Time"))
        {
            if(currentBalance==0){System.out.println("Out of money!");return;}
            if(games.equals("OutFall 4")){if(currentBalance<39.99){System.out.println("Too Expensive");}else {System.out.printf("Bought %s%n",games);currentBalance-=39.99;}}
            else if(games.equals("CS: OG")){if(currentBalance<15.99){System.out.println("Too Expensive");}else {System.out.printf("Bought %s%n",games);currentBalance-=15.99;}}
            else if(games.equals("Zplinter Zell")){if(currentBalance<19.99){System.out.println("Too Expensive");}else {System.out.printf("Bought %s%n",games);currentBalance-=19.99;}}
            else if(games.equals("Honored 2")){if(currentBalance<59.99){System.out.println("Too Expensive");}else {System.out.printf("Bought %s%n",games);currentBalance-=59.99;}}
            else if(games.equals("RoverWatch")){if(currentBalance<29.99){System.out.println("Too Expensive");}else {System.out.printf("Bought %s%n",games);currentBalance-=29.99;}}
            else if(games.equals("RoverWatch Origins Edition")){if(currentBalance<39.99){System.out.println("Too Expensive");}else {System.out.printf("Bought %s%n",games);currentBalance-=39.99;}}
            else {System.out.println("Not Found");}
            games = scan.nextLine();
        }
        if(games.equals("Game Time")){if(currentBalance==0){System.out.println("Out of money!");return;}System.out.printf("Total spent: $%.2f. Remaining: $%.2f",(total-currentBalance),currentBalance);}
    }
}
