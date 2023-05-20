package com.company;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;
public class ListHouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> guestList= new ArrayList<>();
        int n = Integer.parseInt(scan.nextLine());

        for(int i=1;i<=n;i++) {
            String inputLine = scan.nextLine();
            String[] input = inputLine.split(" ");
            if (input[2].equals("going!")){
                        if(!guestList.contains(input[0])) {
                            guestList.add(input[0]);
                        }
                        else{System.out.printf("%s is already in the list!%n", input[0]);}}
                        else if(input[2].equals("not")){
                    if(guestList.contains(input[0])){
                            guestList.remove(input[0]);
                        }
                        else {System.out.printf("%s is not in the list!%n",input[0]);}
            }
        }
//        String guests = String.join("%n",guestList.toString()).replaceAll("[\\[\\],]","");
//        System.out.println(guests);
        for(String guest:guestList){
            System.out.println(guest);
        }

    }
}
