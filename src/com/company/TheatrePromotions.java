package com.company;

import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dayType = scan.nextLine().toLowerCase();
        int age =  Integer.parseInt(scan.nextLine());
        double price = 0.0;
        switch (dayType)
        {
            case "weekday":
                if(age>=0&&age<=18||age>64&&age<=122){price = 12;}
                else if(age>18&&age<=64){price = 18;}
                break;
            case "weekend":
                if(age>=0&&age<=18||age>64&&age<=122){price = 15;}
                else if(age>18&&age<=64){price = 20;}
                break;
            case "holiday":
                if(age>=0&&age<=18){price = 5;}
                else if(age>18&&age<=64){price = 12;}
                else if(age>64&&age<=122){price = 10;}
                break;
        }
        if(price!=0){System.out.printf("%.0f$",price);}
        else {System.out.println("Error!");}
    }
}
