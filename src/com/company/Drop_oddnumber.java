package com.company;

import java.util.Scanner;

//对于一个由0..n的所有数按升序组成的序列，我们要进行一些筛选，每次我们取当前所有数字中从小到大的第奇数位个的数，并将其丢弃。重复这一过程直到最后剩下一个数。请求出最后剩下的数字。
public class Drop_oddnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            int n = Integer.parseInt(input);
            int x = 1;
            while((n+1)>=x){
                x = x*2;
            }
            x = x/2-1;
            System.out.println(x);
        }
    }
}
