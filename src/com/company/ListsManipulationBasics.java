package com.company;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListsManipulationBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list= Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scan.nextLine();
        while(!input.equals("end")){
            String[] inputLine = input.split(" ");
            switch (inputLine[0]){
                case "Add":
                    String number = inputLine[1];
                    int num = Integer.parseInt(number+"");
                    list.add(list.size(),num);
                    break;
                case "Remove":
                    String numberR = inputLine[1];
                    int numR = Integer.parseInt(numberR+"");
                    list.remove(Integer.valueOf(numR));
                    break;
                case "RemoveAt":
                    String numberRat = inputLine[1];
                    int numRat = Integer.parseInt(numberRat+"");
                    list.remove((int)(numRat));
                    break;
                case "Insert":
                    String numberIns = inputLine[1];
                    String Index = inputLine[2];
                    int numIns = Integer.parseInt(numberIns+"");
                    int Ins = Integer.parseInt(Index+"");
                    list.add(Ins,numIns);
                    break;
            }
            input = scan.nextLine();
        }
String finalState = String.join(" ",list.toString().replaceAll("[\\[\\],]", ""));
        System.out.println(finalState);
    }
}
