package com.company;
import java.util.*;

/**
 * 给出一棵二叉树，返回这棵树的中序遍历
 */
public class Inorder_travelsal_bt {
    ArrayList<Integer> sort =new ArrayList<>();
    public ArrayList<Integer> inorderTraversal (TreeNode root) {
        // write code here
        TreeNode p = root;
        if(p == null)
            return sort;
        else{
            inorderTraversal (p.left);
            sort.add(p.val);
            inorderTraversal (p.right);
        }
        return sort;
    }

}
