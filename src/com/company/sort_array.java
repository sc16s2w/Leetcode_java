package com.company;

import java.util.Scanner;


//选择排序
public class sort_array {
    public static void selection_sort(int[] array, int sort) {
        int length = array.length;
        if (sort == 0) {
            int min;
            for (int i = 0; i < length - 1; i++) {
                min = i;
                for (int j = i + 1; j < length; j++) {
                    if (array[j] < array[min]) {
                        min = j;
                    }
                }

                swap(array, i, min);
            }
            for (int i = 0; i < length; i++)
                System.out.println(array[i]);

        } else {
            int max;
            for (int i = 0; i < length - 1; i++) {
                max = i;
                for (int j = i + 1; j < length; j++) {
                    if (array[j] > array[max]) {
                        max = j;
                    }
                }
                swap(array, i, max);
            }
            for (int a : array)
                System.out.println(a);
        }
    }
    //工具函数
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    //冒泡排序
    public static void bubble_sort(int[] array, int sort) {
        int length = array.length;
        if (sort == 0) {
            for (int i = 0; i < length - 1; i++) {
                for (int j = 0; j < length-1-i; j++) {
                    if (array[i] > array[j]) {
                        swap(array, i, j);
                    }
                }
            }
            for (int i = 0; i < length; i++)
                System.out.println(array[i]);

        } else {
            for (int i = 0; i < length - 1; i++) {
                for (int j = i + 1; j < length; j++) {
                    if (array[i] < array[j]) {
                        swap(array, i, j);
                    }
                }
            }
            for (int i = 0; i < length; i++)
                System.out.println(array[i]);
        }
    }

    //插入排序
    public static void insert_sort(int[] array, int sort) {
        int length = array.length;
        if (sort == 0) {
            for (int i = 1; i < length; i++) {
                int j = i;
                for(j=i;j>0&&array[j]<array[j-1];j--){
                    swap(array,j,j-1);
                }

            }
            for (int i = 0; i < length; i++)
                System.out.println(array[i]);

        } else {
            for (int i = 1; i < length; i++) {
                int j = i;
                for(j=i;j>0&&array[j]>array[j-1];j--){
                    swap(array,j,j-1);
                }
            }
            for (int i = 0; i < length; i++)
                System.out.println(array[i]);
        }
    }

    public static void swap_2nd(int[] array, int i, int j) {
        array[i] = array[i] ^ array[j];
        array[j] = array[i] ^ array[j];
        array[i] = array[i] ^ array[j];

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            int m = Integer.parseInt(input);
            int[] array = new int[m];
            for (int i = 0; i < m; i++) {
                array[i] = sc.nextInt();// 一个一个读取
            }
            String input_2 = sc.next();
            int n = Integer.parseInt(input_2);
//            selection_sort(array, n);
//            bubble_sort(array, n);
            insert_sort(array,n);
        }
    }
}