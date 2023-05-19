package com.company;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListsManipulationBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list= Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scan.nextLine();
        while(!input.equals("end")){
            String[] inputLine = input.split(" ");
            switch (inputLine[0]){
                /*case "Add":
                    String number = inputLine[1];
                    int num = Integer.parseInt(number+"");
                    list.add(list.size(),num);
                    break;
                case "Remove":
                    String numberR = inputLine[1];
                    int numR = Integer.parseInt(numberR+"");
                    list.remove(Integer.valueOf(numR));
                    break;
                case "RemoveAt":
                    String numberRat = inputLine[1];
                    int numRat = Integer.parseInt(numberRat+"");
                    list.remove((int)(numRat));
                    break;
                case "Insert":
                    String numberIns = inputLine[1];
                    String Index = inputLine[2];
                    int numIns = Integer.parseInt(numberIns+"");
                    int Ins = Integer.parseInt(Index+"");
                    list.add(Ins,numIns);
                    break;*/
                case "Contains":
                    String numberCont = inputLine[1];
                    int numCont = Integer.parseInt(numberCont+"");
                    if(list.contains(numCont)){
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String evenOrOdd = inputLine[1];
                    if(evenOrOdd.equals("even")) {
                        int countEven = 0;
                        List<Integer> sp1 = new ArrayList<>();
                        for (int i = 0; i < list.size(); i++) {
                            int numb = list.get(i);
                            if(numb%2==0){
                                sp1.add(numb);
                                countEven++;
                            }
                        }
                        String it = String.valueOf(sp1);
                        System.out.print(String.join(" ",it).replaceAll("[\\[\\],]", ""));
                        System.out.println();
                    }
                    if(evenOrOdd.equals("odd")) {
                        int countOdd = 0;
                        List<Integer> sp2 = new ArrayList<>();
                        for (int i = 0; i < list.size(); i++) {
                            int numb = list.get(i);
                            if(numb%2!=0){
                                sp2.add(numb);
                                countOdd++;
                            }
                        }
                            String it = String.valueOf(sp2);
                            System.out.print(String.join(" ",it).replaceAll("[\\[\\],]", ""));
                        System.out.println();
                    }
                    break;
                case "Get":
                    String ifsum = inputLine[1];
                    int sum = 0;
                    if(ifsum.equals("sum")){
                    for(int item:list){
                        sum+=item;
                    }
                        System.out.println(sum);

                    }
//                    System.out.println();
                    break;
                case "Filter":
                    String condition = inputLine[1];
                    String numbe = inputLine[2];
                    int numCond = Integer.parseInt(numbe+"");
                    if(condition.equals("<"))
                    {
                        List<Integer>lessThan = new ArrayList<>();
                        for(int item:list){
                            if(item<numCond){
                                lessThan.add(item);
                            }
                        }
                        String lt = String.valueOf(lessThan);
                        System.out.print(String.join(" ",lt).replaceAll("[\\[\\],]", ""));
                        System.out.println();
                    }
                    if(condition.equals(">"))
                    {
                        List<Integer>moreThan = new ArrayList<>();
                        for(int item:list){
                            if(item>numCond){
                                moreThan.add(item);
                            }
                        }
                        String mt = String.valueOf(moreThan);
                        System.out.print(String.join(" ",mt).replaceAll("[\\[\\],]", ""));
                        System.out.println();
                    }
                    if(condition.equals(">="))
                    {
                        List<Integer>moreThanOr = new ArrayList<>();
                        for(int item:list){
                            if(item>=numCond){
                                moreThanOr.add(item);
                            }
                        }
                        String mto = String.valueOf(moreThanOr);
                        System.out.print(String.join(" ",mto).replaceAll("[\\[\\],]", ""));
                        System.out.println();
                    }
                    if(condition.equals("<="))
                    {
                        List<Integer>lessThanOr = new ArrayList<>();
                        for(int item:list){
                            if(item<=numCond){
                                lessThanOr.add(item);
                            }
                        }
                        String lto = String.valueOf(lessThanOr);
                        System.out.print(String.join(" ",lto).replaceAll("[\\[\\],]", ""));
                        System.out.println();
                    }
                    break;
            }
            input = scan.nextLine();
        }
//String finalState = String.join(" ",list.toString().replaceAll("[\\[\\],]", ""));
//        System.out.println(finalState);
    }
}
