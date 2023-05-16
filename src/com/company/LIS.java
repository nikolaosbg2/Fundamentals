package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class LIS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputLine = scan.nextLine();
        String[] inp = inputLine.split(" ");
        int[] nums = Arrays.stream(inp).mapToInt(e->Integer.parseInt(e)).toArray();
        int n = nums.length;
        int[] len = new int[nums.length];
        int[] prev = new int [nums.length];
        int lastInd = -1;
        int maxLength = 0;

        for ( int i = 0; i < n; i++) {
len[i]=1;
prev[i]=-1;
            for (int j = 0; j < i; j++) {
                if(nums[j]<nums[i]&&len[j]+1>len[i]){len[i]=len[j]+1;prev[i]=j;}
            }
            if(len[i]>maxLength){maxLength=len[i];lastInd=i;}
        }
int[] lis = new int[maxLength];
        int current = maxLength-1;
        while(lastInd!=-1)
        {
            lis[current]=nums[lastInd];
            current--;
            lastInd=prev[lastInd];
        }
        for (int h = 0; h < lis.length; h++) {
            System.out.print(lis[h]+" ");
        }

    }
}
