package com.company;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;

public class ListsCardGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        String winner = "";
        List<Integer> firstPlayerDeck = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayerDeck = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
while(firstPlayerDeck.size()!=0&&secondPlayerDeck.size()!=0)
{
    int  firstPlayerCard=firstPlayerDeck.get(0);
            int secondPlayerCard = secondPlayerDeck.get(0);
            firstPlayerDeck.remove(0);
            secondPlayerDeck.remove(0);
            if(firstPlayerCard>secondPlayerCard)
            {
                firstPlayerDeck.add(firstPlayerCard);
                firstPlayerDeck.add(secondPlayerCard);
            }
            else if(secondPlayerCard>firstPlayerCard)
            {
                secondPlayerDeck.add(secondPlayerCard);
                secondPlayerDeck.add(firstPlayerCard);
            }
    if(firstPlayerDeck.size()==0){winner="Second player";
        for(int cards:secondPlayerDeck){sum+=cards;}
    }
    else if(secondPlayerDeck.size()==0){winner="First player";
        for(int cards:firstPlayerDeck){sum+=cards;}
    }

}

        System.out.printf("%s wins! Sum: %d",winner,sum);

        }
    }

