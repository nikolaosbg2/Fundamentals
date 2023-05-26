package com.company;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.stream.Stream;
public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int sumOdRemovedElements = 0;
        while(list.size()>0)
        {
            int index = Integer.parseInt(scan.nextLine());

           if(index>=0&&index<=list.size()-1){
               int removedElement = list.get(index);

               sumOdRemovedElements+=removedElement;
               list.remove(index);
               modifyList(list,removedElement);
           }
           else if (index<0) {
               int firstElement = list.get(0);
               sumOdRemovedElements+=firstElement;
               list.remove(0);
               int  lastElement = list.get(list.size()-1);
               list.add(0,lastElement);
               modifyList(list,firstElement);
           }
           else if(index>list.size()-1){
               int  lastEl = list.get(list.size()-1);
               sumOdRemovedElements+=lastEl;
               list.remove(list.size()-1);
               int firstEl = list.get(0);
               list.add(firstEl);
               modifyList(list,lastEl);
           }

        }
        System.out.println(sumOdRemovedElements);
        }

    public static void  modifyList(List<Integer> list, int removedElement){
        for (int indexInList = 0; indexInList <= list.size()-1; indexInList++) {
int currentElement =  list.get(indexInList);
if(currentElement<=removedElement){
    currentElement+=removedElement;
}
else{
    currentElement-=removedElement;
}
list.set(indexInList,currentElement);
        }
    }
}
