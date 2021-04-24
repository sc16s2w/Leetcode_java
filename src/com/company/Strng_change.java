package com.company;

import java.util.Arrays;
//咋个让先进来的不动哦 push?
public class Strng_change {

    public static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void string_chang(String s){
        char[] arr = s.toCharArray();
        int min;
        for(int i =1; i<arr.length; i++){
            min = i;
            if (Character.isLowerCase(arr[i])||Character.isUpperCase(arr[i])){
                for(int j = i-1 ;j>=0;j--) {
                    if (Character.isLowerCase(arr[j]) || Character.isUpperCase(arr[j])) {
                        if (Character.toLowerCase(arr[j])>Character.toLowerCase(arr[j+1])) {
                            swap(arr, j, j+1);
                        }
                    }
                }
            }
            else{
                arr[i] = arr[i];
            }
        }
        System.out.println(arr);

    }
    public static boolean isToChange(char a, char b,int i,int j) {
        // 需要换位的情况
        String s1 = (String.valueOf(a)).toLowerCase();
        String s2 = (String.valueOf(b)).toLowerCase();
        System.out.println(s1 + s2);
        if (s1.charAt(0) > s2.charAt(0)) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        String s = "A Famous Saying: Much Ado About Nothing (2012/8).";
        string_chang(s);
    }
}
