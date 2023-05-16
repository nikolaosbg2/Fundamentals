package com.company;
import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int totalTimeInMinutesAfterThirtyMin = hours*60+minutes+30;

        int hoursAfter = totalTimeInMinutesAfterThirtyMin/60;
        int minutesAfter = totalTimeInMinutesAfterThirtyMin%60;

       if(minutesAfter>59){hoursAfter+=1;}
       if(hoursAfter>23){hoursAfter=hoursAfter-24;}

System.out.printf("%d:%02d",hoursAfter,minutesAfter);

    }
}
