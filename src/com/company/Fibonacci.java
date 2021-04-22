package com.company;

import static java.lang.Math.sqrt;

public class Fibonacci {
    //带入公式
    public int Fibonacci(int n) {
        if(n < 3){
            if(n == 0){
                int result = 0;
                return result;
            }
            else{
                int result = 1;
                return result;
            }

        }
        else{
            int result = (int) (1/sqrt(5)*(Math.pow((1+sqrt(5))/2,n) - Math.pow((1-sqrt(5))/2,n)));
            return result;
        }

    }

    //利用通项公式
    public int Fibonacci_2nd(int n) {
        if(n < 3){
            if(n == 0){
                int result = 0;
                return result;
            }
            else{
                int result = 1;
                return result;
            }
        }
        else{
            int temp = 0;
            int x = 1;
            int y = 1;
            for(int i =3; i<=n;i++){
                temp = x+y;
                x = y;
                y = temp;
            }
            return temp;
        }

    }

}
