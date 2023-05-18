package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListsGaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> gaus = Arrays.stream(scan.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        int size = gaus.size();

        for (int i = 0; i < size / 2; i++) {

            gaus.set(i, gaus.get(i) + gaus.get(gaus.size() - 1));
            gaus.remove(gaus.size() - 1);

        }

            for(double items:gaus)

    {
        String it = String.format("%.0f", items);
        System.out.print(it + " ");
    }

}
}
