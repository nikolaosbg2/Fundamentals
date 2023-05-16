package com.company;
import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scan.nextLine());
        String peopleType = scan.nextLine().toLowerCase();
        String day = scan.nextLine().toLowerCase();
        double totalPrice = 0;
        switch (peopleType)
        {
            case "students":
                if(day.equals("friday")){totalPrice=peopleCount*8.45;}
                if(day.equals("saturday")){totalPrice=peopleCount*9.80;}
                if(day.equals("sunday")){totalPrice=peopleCount*10.46;}
                if(peopleCount>=30){totalPrice=totalPrice-totalPrice*0.15;}
                break;
            case "business":
                if(peopleCount>=100){peopleCount=peopleCount-10;}
                if(day.equals("friday")){totalPrice=peopleCount*10.90;}
                if(day.equals("saturday")){totalPrice=peopleCount*15.60;}
                if(day.equals("sunday")){totalPrice=peopleCount*16;}

                break;
            case "regular":
                if(day.equals("friday")){totalPrice=peopleCount*15;}
                if(day.equals("saturday")){totalPrice=peopleCount*20;}
                if(day.equals("sunday")){totalPrice=peopleCount*22.50;}
                if(peopleCount>=10&&peopleCount<=20){totalPrice=totalPrice-totalPrice*0.05;}
                break;
        }
        System.out.printf("Total price: %.2f",totalPrice);
    }
}
