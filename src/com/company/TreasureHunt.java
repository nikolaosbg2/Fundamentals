package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputLine = scan.nextLine();
        String separator = "|";
        String[] arr = inputLine.split(Pattern.quote(separator));
        String loot = "";
        String lele = "";
        String lilo = "";
        String stolen = "";
        String stlit ="";
        String sil = "";
        boolean com1 = false;
double sum = 0;
double average = 0;
        for (int i = 0; i < arr.length; i++) {
            loot+=arr[i]+" ";
        }
        String command = scan.nextLine();
        while(!command.equals("Yohoho!"))
        {
            String[] com = command.split(" ");
            if(com[0].equals("Loot"))
            {
                if(com.length>=2){com1=true;}
                for (int i = 1; i <com.length ; i++) {
                    if(com1){if(!loot.contains(com[i])){loot=com[i]+" "+loot;}}
                }
com1=false;
            }
            String[] lot = loot.split(" ");
            int le = lot.length;
            if(com[0].equals("Drop"))
            {
                int ind1 = Integer.parseInt(com[1]);
boolean g = ind1<0||ind1>lot.length;
if(!g)
{
    for (int gg = 0; gg < lot.length; gg++)
    {
        if(gg!=ind1){lele+=lot[gg]+" ";}

    }
    lele+=lot[ind1]+" ";
}
            }
            String[] lel = lele.split(" ");
            if(com[0].equals("Steal"))
            {
                int countStolen = Integer.parseInt(com[1]);
                if(countStolen>=lel.length)
                {System.out.println(String.join(", ",lel));
                    for (int i = 0; i < lel.length-1; i++)
                    {
                        lel[i]="";
                        lilo+=lel[i]+" ";
                    }

                }
                else
                {
                    int ll = lel.length;
                    for (int i = 1; i <=countStolen ; i++) {
                        stolen=lel[ll-i]+" "+stolen;
                    }
                    String[] stl = stolen.split(" ");
                    stlit=String.join(", ",stl);
                    System.out.println(stlit);

                    for (int j = lel.length-1; j >= countStolen; j--)
                    {
                        lilo=lel[j-countStolen]+" "+lilo;

                    }
                }
            }
            command=scan.nextLine();
        }
        String[] fin = lilo.split(" ");
        if(fin.length<=0){System.out.println("Failed treasure hunt.");}
        else
        {
            for (int r = 0; r < fin.length; r++)
            {
               sum +=fin[r].length();
            }
            average=sum/ fin.length;
            System.out.printf("Average treasure gain: %.2f pirate credits.",average);
        }
    }
}
