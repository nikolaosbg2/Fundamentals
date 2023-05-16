package com.company;
import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        topInteger(n);
    }
    public static void topInteger(int number) {


            for (int i = 1; i <= number; i++) {
                boolean flag = false;
                String r = String.valueOf(i);
                for (int j = 0; j < r.length(); j++) {
                    if (r.charAt(j) % 2 != 0) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    int result = 0;
                    String num = String.valueOf(i);
                    for (int j = 0; j < num.length(); j++) {
                        int res = Integer.parseInt(num.charAt(j) + "");
                        result += res;
                    }
                    if (result % 8 == 0) {
                        System.out.println(i);
                    }
                }
            }

            }
}
