package com.company;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.stream.Stream;

public class ListAnonymousThreat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String res = "";
        String arr = scan.nextLine();
        List<String> list = Arrays.stream(arr.split(" ")).map(String::toString).collect(Collectors.toList());
String commands =  scan.nextLine();
String[] com = commands.split(" ");

        while(!commands.equals("3:1"))
        {
            switch (com[0]) {
                case "merge":
                    int startIndex = Integer.parseInt(com[1]);
                    int endIndex = Integer.parseInt(com[2]);
                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    if (endIndex > list.size() - 1) {
                        endIndex = list.size() - 1;
                    }
                    boolean isValidIndexes = startIndex <= endIndex && startIndex <= list.size() - 1 && endIndex >= 0;
                    if (isValidIndexes) {
                        for (int i = startIndex; i <= endIndex; i++) {
                            res += list.get(i);
                            list.set((int) startIndex, res);
                        }
                        for (int i = startIndex; i <= endIndex; i++) {
                            list.remove((int) startIndex);
                        }
                        list.add(startIndex, res);
                    }
                    res = "";
                    break;
                case "divide":
                    int Index = Integer.parseInt(com[1]);
                    int partitions = Integer.parseInt(com[2]);
                    String result = "";
                    String text = list.get(Index);
                    list.remove(Index);
                    int partSize = text.length() / partitions;
                    int beginIndexofText = 0;
                    int count = 0;
                    for (int part = 1; part < partitions; part++) {
list.add(Index,text.substring(beginIndexofText,beginIndexofText+partSize));
Index++;
beginIndexofText+=partSize;
                    }
                    list.add(Index,text.substring(beginIndexofText));
            }
            commands=scan.nextLine();
        }
        System.out.println(String.join(" ",list));
//        String arrayToPrint = String.join(" ",list.toString()).replaceAll("[\\[\\],]","");
//        System.out.println(arrayToPrint);
    }
}
