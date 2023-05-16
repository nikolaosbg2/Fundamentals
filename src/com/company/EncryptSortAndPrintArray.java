package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] arr = new int[n];
        int nLines = 0;
        while(nLines != n) {
            String line = scan.next();
            int nSum = 0;
            for (int i = 0; i < line.length(); i++) {
                int indexOfLineAsInt = (int)line.charAt(i);
                char charValidator = Character.toLowerCase(line.charAt(i));

                if( charValidator ==  'a' || charValidator == 'o' || charValidator == 'u'
                        || charValidator == 'e' || charValidator ==  'i' ) {
                    indexOfLineAsInt *= line.length();
                    nSum += indexOfLineAsInt;
                } else {
                    indexOfLineAsInt /= line.length();
                    nSum += indexOfLineAsInt;
                }
            }
            arr[nLines] = nSum;
            nLines++;
        }
        Arrays.sort(arr);
        for (int number: arr) {
            System.out.println(number);
        }
    }
}
