package com.company;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int letterCount = Integer.parseInt(scan.nextLine());
        String res = "";
        for (int i = 1; i <=letterCount ; i++)
        {
            int number = Integer.parseInt(scan.nextLine());
            String num = String.valueOf(number);
            int digits = num.length();
            int mainDigit = Integer.parseInt(num.charAt(0)+"");
            int offset = (mainDigit-2)*3;
            if(mainDigit==8||mainDigit==9){offset+=1;}
            int letterIndex = (offset+digits-1);
            int result = 'a' + letterIndex;
            if(number==0){result=' ';}
            res +=(char)result;
            //System.out.print((char)result);
        }
        System.out.println(res);
    }
}
