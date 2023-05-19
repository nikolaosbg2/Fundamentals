package com.company;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;

public class ListRemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0; i <= list.size()-1; i++) {
            if(list.get(i)<0){
                list.remove((int)i);
                i--;
            }
        }
        if(list.size()==0){
            System.out.println("empty");
        }
else{
            Collections.reverse(list);
            System.out.print(String.join(" ",list.toString()).replaceAll("[\\[\\],]",""));
        }
    }
}
