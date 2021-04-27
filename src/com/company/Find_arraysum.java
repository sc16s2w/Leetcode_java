package com.company;

public class Find_arraysum {
    public int[] twoSum (int[] numbers, int target) {
        // write code here
        int index1 = 0;
        int index2 = 0;
        int[] result = new int[2];
        for(int i = 0; i<numbers.length;i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if ((numbers[i] + numbers[j]) == target) {
                    index1 = Math.min(i, j)+1;
                    index2 = Math.max(i, j)+1;
                }
            }
        }
        result[0] = index1;
        result[1] = index2;
        return result;
    }
}
