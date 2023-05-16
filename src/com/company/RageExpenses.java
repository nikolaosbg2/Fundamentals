package com.company;
import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gamesLostCount = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());
        int lostGameCounter = 0;
        double rageExpenses = 0;
        int dummy1 = gamesLostCount;
        int dummy2 = gamesLostCount;
        int headsetTimes = 0;
        int mouseTimes = 0;
        int keyboardTimes = 0;
        int displayTimes = 0;
        int threeCounter = 0;

        for (int j = 0; j <= dummy1; j++) {
            if (j == 2) {
                headsetTimes++;
                j = 0;
                dummy1 -= 2;
            }
        }
        for (int k = 0; k <= dummy2; k++) {
            if (k == 3) {
                mouseTimes++;
                threeCounter+=3;
                k = 0;
                dummy2 -= 3;
                if(threeCounter%2==0){keyboardTimes++;}
            }
        }
        displayTimes=keyboardTimes/2;
        rageExpenses = headsetTimes * headsetPrice + mousePrice * mouseTimes + keyboardTimes * keyboardPrice + displayTimes * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.", rageExpenses);
    }
}
