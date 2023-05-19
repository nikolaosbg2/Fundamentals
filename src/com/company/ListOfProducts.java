package com.company;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<String> products = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String prod = scan.nextLine();
            products.add(prod);
        }
        Collections.sort(products);
        int l = 0;
        for (String items:products) {
            l++;
            System.out.printf("%d.%s\n",l,items);

        }

    }
}
