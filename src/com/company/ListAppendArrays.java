package com.company;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;

public class ListAppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> listSeparatedByPipe = Arrays.stream(input.split("\\|")).collect(Collectors.toList());

        Collections.reverse(listSeparatedByPipe);



        System.out.println(listSeparatedByPipe.toString()
                .replace("[", "")
                .replace("]", "")
                .trim()
                .replaceAll(",", "")
                .replaceAll("\\s+", " "));
    }
}
