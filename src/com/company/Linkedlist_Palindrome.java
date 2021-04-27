package com.company;

//快慢指针解决链表是否为回文结构
public class Linkedlist_Palindrome {
    public boolean chkPalindrome(ListNode A) {
        if (A == null) {
            return true;
        }
        // write code here
        ListNode middle_node = endOfFirstHalf(A);
        ListNode reverse = reverse_linkedlist(middle_node.next);
        boolean check = true;
        ListNode p1 = A;
        ListNode p2 = reverse;
        while(check&&p2!= null){
            if(p1.val != p2.val)
                check = false;
            p1 = p1.next;
            p2 = p2.next;

        }
        return check;


    }
    //这个函数用来找链表的中点，调用快慢指针
    private ListNode endOfFirstHalf(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //这个函数用来反转链表
    private ListNode reverse_linkedlist(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while(cur!=null)
        {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}
