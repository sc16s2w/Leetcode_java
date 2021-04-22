package com.company;

public class binary_search {
    //蠢办法
    public boolean Find(int target, int [][] array) {
       for(int i=0; i < array.length;i++){
           for(int j=0;j<array[i].length;j++){
               if(array[i][j] == target){
                   return true;
               }
           }
       }
       return false;

    }
    //聪明办法 二分
    public boolean Find_2rd(int target, int [][] array) {
        for(int i=0; i < array.length;i++){
            int length = array[i].length;
            boolean ans= binaryEqualFind(array[i],0 , length-1 ,target );
            if(ans) return true;
            }
        return false;

    }

    public boolean binaryEqualFind(int[] array, int low, int high, int target) {
        if (low > high || target < array[low] || target > array[high]) {
            return false;
        } else {
            int mid = (high + low) / 2;
            if (array[low] <= target && array[mid]>target) {
                return binaryEqualFind(array, low, mid - 1, target);
            } else if (array[mid] == target) {
                return true;
            } else{
                return binaryEqualFind(array, mid + 1, high, target);
            }
        }
    }


}
