package com.company;
import java.util.*;
import java.util.LinkedList;


class ListNode{
    int val;
    ListNode next;

    public ListNode(int x){
        val=x;
    }
}


public class Sort_linked_list {
    public static ListNode insertionSortList(ListNode head) {
        // write code here
        ListNode p=head;
        int length = 0;
        while(p!=null)
        {
            length++;
            p=p.next;
        }
        ListNode q = head;
        int arr[] = new int[length];
        int i = 0;
        if(head == null){
            return null;
        }
        while(q!=null)
        {
            arr[i] = q.val;
            q=q.next;
            i = i+1;
        }
        for (int m = 1; m < arr.length; m++) {
            int j = m;
            for(j=m;j>0&&arr[j]<arr[j-1];j--){
                swap(arr,j,j-1);
            }
        }
//        for(int a: arr)
//            System.out.println(a);
        ListNode root = new ListNode(arr[0]);
        ListNode other = root;//生成另一个节点，并让other指向root节点，other在此作为一个临时变量，相当于指针
        for (int j= 1; j < arr.length; j++) {//由于已给root赋值，所以i从1开始
            ListNode temp = new ListNode(arr[j]);//每循环一次生成一个新的节点,并给当前节点赋值
            other.next = temp;//将other的下一个节点指向生成的新的节点
            other = temp;//将other指向最后一个节点(other的下一个节点)  other=other.getNext();
        }
        return root;

    }


    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {1,7,10};
        int[] b = new int[3];
        ListNode root = new ListNode(a[0]);
        ListNode other = root;//生成另一个节点，并让other指向root节点，other在此作为一个临时变量，相当于指针
        for (int j= 1; j < a.length; j++) {//由于已给root赋值，所以i从1开始
            ListNode temp = new ListNode(a[j]);//每循环一次生成一个新的节点,并给当前节点赋值
            other.next = temp;//将other的下一个节点指向生成的新的节点
            other = temp;//将other指向最后一个节点(other的下一个节点)  other=other.getNext();
        }
        ListNode hh = insertionSortList(root);
        int i = 0;
        while(hh!=null)
        {
            b[i] = hh.val;
            hh=hh.next;
            i = i+1;
        }
        for(int x: b)
            System.out.println(x);
    }

}
