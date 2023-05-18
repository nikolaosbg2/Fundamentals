package com.company;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListsMergingLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list1= Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> list2= Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();

        if(list1.size()>list2.size()){

            for (int i = 0; i < list2.size(); i++) {
                result.add(list1.get(i));result.add(list2.get(i));
            }
            for (int i = list2.size(); i <list1.size() ; i++) {
                result.add(list1.get(i));
            }
            for (int items:result) {
                System.out.print(items+" ");
            }
        }
        else if(list1.size()<list2.size()){
            for (int i = 0; i < list1.size(); i++) {
                result.add(list1.get(i));result.add(list2.get(i));
            }
            for (int i = list1.size(); i <list2.size() ; i++) {
                result.add(list2.get(i));
            }
            for (int items:result) {
                System.out.print(items+" ");
            }
        }
        else {
            for (int i = 0; i < list1.size(); i++) {
                result.add(list1.get(i));result.add(list2.get(i));
            }
            for (int items:result) {
                System.out.print(items+" ");
            }
        }


    }
}
