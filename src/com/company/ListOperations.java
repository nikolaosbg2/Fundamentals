package com.company;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
String command = scan.nextLine();
while(!command.equals("End")){
    String[] com = command.split(" ");
    switch (com[0]){
        case "Add":
            int number = Integer.parseInt(com[1]);
            list.add(number);
            break;
        case "Insert":
            int numberToInsert = Integer.parseInt(com[1]);
            int index = Integer.parseInt(com[2]);
            if (index < 0 || index > list.size()-1) {
                System.out.println("Invalid index");
            }
            else{
//                if(index==list.size()-1){list.add(numberToInsert);list.add(list.get(list.size()-2));list.remove(list.size()-2);}
//                else{
            list.add(index,numberToInsert);}//}
            break;
        case "Remove":
        int indexToRemove = Integer.parseInt(com[1]);
            if (indexToRemove < 0 || indexToRemove > list.size()-1) {
                System.out.println("Invalid index");break;
            }
            else{
        list.remove((int)indexToRemove);}
        break;
        case "Shift":
            String leftOrRight = com[1];
            int count = Integer.parseInt(com[2]);
            if(leftOrRight.equals("left")){

                for (int i = 1; i <=count ; i++) {

                    int temp = list.get(0);
                    int position = list.size() - 1;
                    if (position < 0 || position >= list.size()) {
                        System.out.println("Invalid index");
                    } else {

                        list.add(temp);
                list.remove((int)0);
                    }
                }
                }

            else if(leftOrRight.equals("right")){

                for (int i = 1; i <=count ; i++) {

                    int l = list.size();
                    int temp2 = list.get(l - 1);
                    int position2 = 0;
                    if (position2 < 0 || position2 >= list.size()) {
                        System.out.println("Invalid index");
                    } else {
                        list.add(position2, temp2);
                        list.remove((int) l);
                    }
                }
            }
            break;
    }

    command=scan.nextLine();
}
String finalState = String.join(" ",list.toString()).replaceAll("[\\[\\],]","");
        System.out.println(finalState);

    }
}
