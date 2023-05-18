package com.company;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListsLab1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String values  = scan.nextLine();
        List<Double> items = Arrays.stream(values.split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        for (int i = 0; i < items.size()-1; i++) {
            if(items.get(i).equals(items.get(i+1))){
                items.set(i, items.get(i)+items.get(i+1));
items.remove(i+1);
i=-1;
            }
        }
String output = joinElementsByDelimiter(items, " ");
        System.out.println(output);
    }
    static String joinElementsByDelimiter(List<Double> items, String delimiter){
        String output ="";
    for(Double item: items){output+=(new DecimalFormat("0.#").format(item)+delimiter);}
    return output;

    }
}
