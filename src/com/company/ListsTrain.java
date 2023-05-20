package com.company;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListsTrain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacityPerWagon = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        while (!input.equals("end")) {

            String[] inputLine = input.split(" ");
            if(inputLine.length==2){
            if (inputLine[0].equals("Add")) {
                int passangers = Integer.parseInt(inputLine[1]);
                wagons.add(passangers);
            }}
            else if(inputLine.length==1) {
                int passengersToFill = Integer.parseInt(inputLine[0]);
                for (int i = 0; i <= wagons.size()-1; i++) {
                    if (wagons.get(i) + passengersToFill <= maxCapacityPerWagon) {
                        int addon = wagons.get(i);
                        wagons.set(i, (addon + passengersToFill));
break;
                    }
                }
                }

            input = scan.nextLine();
        }
        String print = String.join(" ",wagons.toString()).replaceAll("[\\[\\],]", "");
        System.out.println(print);
    }
}
