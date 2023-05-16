package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputLine = scan.nextLine();
        String[] arr = inputLine.split(" ");
        int[] array3 = Arrays.stream(arr).mapToInt(e -> Integer.parseInt(e)).toArray();
        String al ="";
String result = "";
        String commands = scan.nextLine();

        while(!commands.equals("end"))
        {
            String[] com = commands.split(" ");

            if(com[0].equals("swap"))
            {
                int ind1 = Integer.parseInt(com[1]+"");
                int ind2 = Integer.parseInt(com[2]+"");
                int t = 0;
                t = array3[ind1];array3[ind1]=array3[ind2];array3[ind2]=t;
            }
            if(com[0].equals("multiply"))
            {
                int ind1 = Integer.parseInt(com[1]+"");
                int ind2 = Integer.parseInt(com[2]+"");
                int r = array3[ind1]*array3[ind2];
                array3[ind1]=r;
            }
            if(com[0].equals("decrease"))
            {
                for (int i = 0; i < array3.length; i++)
                {
                    array3[i]-=1;
                }
            }
            commands=scan.nextLine();
        }
        for (int j = 0; j < array3.length; j++) {
            result+=String.valueOf(array3[j]+" ");
        }
String[] res = result.split(" ");
String reses ="";
reses = String.join(", ",res);
System.out.println(reses);
    }
}
