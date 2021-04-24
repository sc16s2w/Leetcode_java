package com.company;

import java.util.Arrays;

public class Find_shortestarray {
    public int findShortest(int[] A, int n) {
        // write code here
        int B[] = new int[A.length];
        for(int i=0;i<A.length; i++){
            B[i] = A[i];
        }
        Arrays.sort(B);
        int i = 0;
        while(i<A.length&&A[i] == B[i]){
            i++;
        }
        int j = n-1;
        while(j>i&&A[j] == B[j]){
            j--;
        }
        return j-i+1;
    }
}
