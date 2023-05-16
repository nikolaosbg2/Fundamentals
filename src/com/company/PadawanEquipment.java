package com.company;
import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double amountTotal = Double.parseDouble(scan.nextLine());
        int studentsCount = Integer.parseInt(scan.nextLine());
        double priceOfLightsabers = Double.parseDouble(scan.nextLine());
        double priceOfRobes = Double.parseDouble(scan.nextLine());
        double priceOfBelts = Double.parseDouble(scan.nextLine());
        int studentsWithBelts = studentsCount;
        int dummy = studentsCount;
        if(studentsCount>=6) {
            for (int i = 0; i <= dummy; i++) {
               if(i==6){studentsWithBelts--;i=0;dummy-=6;}
            }
        }
        double calculatedAmount = (studentsCount+Math.ceil(studentsCount*0.10))*priceOfLightsabers+studentsCount*priceOfRobes+studentsWithBelts*priceOfBelts;
if(calculatedAmount<=amountTotal){System.out.printf("The money is enough - it would cost %.2flv.",calculatedAmount);}
else {System.out.printf("George Lucas will need %.2flv more.",Math.abs(amountTotal-calculatedAmount));}
    }
}
