package com.company;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputFollowing = scan.nextLine();
        switch(inputFollowing){
            case "int":
                int n = Integer.parseInt(scan.nextLine());
                System.out.println(dataType(n));
                break;
            case "real":
                double r = Double.parseDouble(scan.nextLine());
                System.out.printf("%.2f",dataType(r));
                break;
            case "string":
                String l = scan.nextLine();
                System.out.println(dataType(l));
                break;

        }

    }
    public static String dataType(String input){
        String res = "";
        res = "$"+input+"$";
        return res;
        }
    public static double dataType(double input){
        double result = input*1.5;
        return result;
    }
    public static int dataType(int input){
        int result2 = input*2;
        return result2;
    }

}
