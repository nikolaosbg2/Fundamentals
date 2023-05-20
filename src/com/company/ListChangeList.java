package com.company;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;

public class ListChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listToChange = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
String commands = scan.nextLine();
while(!commands.equals("end")){
    String[] com = commands.split(" ");
    switch(com[0]){
        case "Delete":
            int element = Integer.parseInt(com[1]);
            for (int i = 0; i <= listToChange.size()-1; i++) {
               if(listToChange.get(i)==element){listToChange.remove((int)i);}
            }
            break;
        case "Insert":
            int elem = Integer.parseInt(com[1]);
            int position = Integer.parseInt(com[2]);
            listToChange.add(position,elem);
            break;
    }
    commands=scan.nextLine();
}
String arrayToPrint = String.join(" ",listToChange.toString()).replaceAll("[\\[\\],]","");
        System.out.println(arrayToPrint);
    }
}
