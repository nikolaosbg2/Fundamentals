package com.company;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;

public class ListsBombNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        List<Integer> list = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String bombNumber = scan.nextLine();
        String[] bombNum = bombNumber.split(" ");
        int bombnumb = Integer.parseInt(bombNum[0]);
        int power = Integer.parseInt(bombNum[1]);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == bombnumb)
            {
                if(list.size()==1){list.remove(i);break;}
                if(power==0){list.remove(i);break;}
                if(i-power>=0&&i+power<=list.size()-1)
                {
                    for (int j = i; j < i+power; j++) {
                        list.remove((int)j);
                    }
                    for (int j = i; j >= i-power; j--) {
                        list.remove((int)j);
                    }
                }
                else if(i-power<0&&i+power<=list.size())
                {
                    for (int j = i; j < i+power; j++) {
                        list.remove((int)j);
                    }
                    for (int j = i; j >= 0; j--) {
                        list.remove((int)j);
                    }
                }
                else if(i-power>=0&&i+power>list.size())
                {
                    for (int j = i; j < list.size(); j++) {
                        list.remove((int)j);
                    }
                    for (int j = i; j >= i-power; j--) {
                        list.remove((int)j);
                    }
                }
                else if(i-power<0&&i+power>list.size())
                {
                    for (int j = i; j < list.size(); j++) {
                        list.remove((int)j);
                    }
                    for (int j = i; j >= 0; j--) {
                        list.remove((int)j);
                    }
                }
            }
        }

        for(int itemsLeft:list){sum+=itemsLeft;}
        System.out.println(sum);
    }
}


