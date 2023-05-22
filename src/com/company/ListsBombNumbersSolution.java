package com.company;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;
public class ListsBombNumbersSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer>numSequence = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
String bombNumAndPower = scan.nextLine();
int bombNumumber = Integer.parseInt(bombNumAndPower.split("\\s+")[0]);
int bombPower = Integer.parseInt(bombNumAndPower.split("\\s+")[1]);
while(numSequence.contains(bombNumumber)) {
    int index = numSequence.indexOf(bombNumumber);
    int leftStartIndex = Math.max(0, index - bombPower);
    int rightStopIndex = Math.min(index + bombPower, numSequence.size() - 1);
    for (int i = rightStopIndex; i >= leftStartIndex; i--) {
        numSequence.remove(i);
    }
}
int sum = 0;
for(Integer num:numSequence){sum+=num;}
        System.out.println(sum);
    }
}
