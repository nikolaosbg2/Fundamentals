package com.company;
import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X1 = Integer.parseInt(scan.nextLine());
        int Y1 = Integer.parseInt(scan.nextLine());
        int X2 = Integer.parseInt(scan.nextLine());
        int Y2 = Integer.parseInt(scan.nextLine());
        int X3 = Integer.parseInt(scan.nextLine());
        int Y3 = Integer.parseInt(scan.nextLine());
        int X4 = Integer.parseInt(scan.nextLine());
        int Y4 = Integer.parseInt(scan.nextLine());
isCloser(X1,Y1,X2,Y2,X3,Y3,X4,Y4);
    }
    public static void isCloser(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        double distance1 = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        double distance2 = Math.sqrt(Math.pow((x4-x3),2)+Math.pow((y4-y3),2));
        double distance3 = Math.sqrt(Math.pow((x1-0),2)+Math.pow((y1-0),2));
        double distance4 = Math.sqrt(Math.pow((x2-0),2)+Math.pow((y2-0),2));
        double distance5 = Math.sqrt(Math.pow((x3-0),2)+Math.pow((y3-0),2));
        double distance6 = Math.sqrt(Math.pow((x4-0),2)+Math.pow((y4-0),2));


        if(distance1>distance2){
            if(distance4<distance3){System.out.printf("(%d, %d)(%d, %d)",x2,y2,x1,y1);}
            if(distance4>distance3){System.out.printf("(%d, %d)(%d, %d)",x1,y1,x2,y2);}
            if(distance4==distance3){System.out.printf("(%d, %d)(%d, %d)",x1,y1,x2,y2);}
        }
        else if(distance2>distance1){
            if(distance6<distance5){System.out.printf("(%d, %d)(%d, %d)",x4,y4,x3,y3);}
            if(distance6>distance5){System.out.printf("(%d, %d)(%d, %d)",x3,y3,x4,y4);}
            if(distance6==distance5){System.out.printf("(%d, %d)(%d, %d)",x3,y3,x4,y4);}
        }
        else {System.out.printf("(%d, %d)(%d, %d)",x1,y1,x2,y2);}

    }

}
