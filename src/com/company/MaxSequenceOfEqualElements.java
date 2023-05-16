package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = false;
        int bo = 0;
        int counter = 0;
        int maxCounter = 0;
        int sum = 0;
        int maxEl = 0;
String inputLine = scan.nextLine();
String[] arr = inputLine.split(" ");
int[] array2 = Arrays.stream(arr).mapToInt(e -> Integer.parseInt(e)).toArray();
        int total = 0;
        int l =array2.length;
        String val  = "";
        int areAllEqual = 1;
        int areallDifferent = 1;
        boolean fl = false;
        boolean h = false;
        int diffCount =0;
        if(array2.length==1){System.out.print("1");return;}
        for (int ppr2 = 0; ppr2 <array2.length-1 ; ppr2++)
        {
            if(array2[ppr2]==array2[ppr2+1]){areallDifferent=1;break;}
            else {areallDifferent=0;}
        }
        if(areallDifferent==0){System.out.print("1");return;}

            for (int ppr = 0; ppr <= array2.length - 1; ppr++) {
                if (array2[0] != array2[ppr]) {
                    areAllEqual = 1;
                    break;
                } else {
                    areAllEqual = 0;
                }
            }
            if (areAllEqual == 0) {
                for (int w = 0; w < array2.length; w++) {
                    System.out.print(array2[w] + " ");
                }
                return;
            }
            for (int i = 0; i < array2.length - 1; i++) {
                if (array2[i] == array2[i + 1]) {
                    counter++;
                    bo = array2[i];
                    sum += array2[i];
                    if (i + 1 == array2.length - 1) {
                        for (int mm = 1; mm <= counter + 1; mm++) {
                            val += String.valueOf(array2[i] + " ");
                        }
                        if (maxCounter < counter + 1) {
                            maxCounter = counter + 1;
                            maxEl = array2[i];
                        }
                    }
                } else {

                    int element = (sum + bo) / (counter + 1);
                    if (maxCounter < counter + 1) {
                        maxCounter = counter + 1;
                        maxEl = element;
                    }

                    total += counter + 1;
                    for (int j = 1; j <= counter + 1; j++) {

                        val += String.valueOf(element + " ");
                    }
                    counter = 0;
                    sum = 0;
                    bo = 0;
                }

            }
                for (int er = 1; er <= maxCounter; er++) {
                    System.out.print(maxEl + " ");
                }
    }
}
