package com.company;
import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startingYield = Integer.parseInt(scan.nextLine());
        int days = 0;
        int totalYield = 0;
        while (startingYield>=100)
        {
            totalYield+=startingYield;
            startingYield-=10;
            if(totalYield>=26){totalYield-=26;}
            days++;
        }
        if(startingYield<100){if(totalYield>=26){totalYield-=26;}}
        System.out.println(days);
        System.out.println(totalYield);
    }
}
