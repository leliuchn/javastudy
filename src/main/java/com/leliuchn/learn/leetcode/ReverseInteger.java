package com.leliuchn.learn.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leliuchn on 17/9/19.
 */
public class ReverseInteger {

    public static void main(String args[]){
        int x = -123456789;
        int y = reverse(x);
        System.out.println(y);
    }

    public static int reverse(int x) {
        List<Integer> integerList = new ArrayList();
        int tmp = x;
        while(tmp !=0 ){
            int mod = Math.abs(tmp%10);
            integerList.add(mod);
            tmp =  tmp/10;
        }
        int sum = 0;
        long ten = 1l;
        for(int j = integerList.size()-1;j >= 0; j--,ten = ten * 10){
            long temp = integerList.get(j) * ten;
            if((Integer.MAX_VALUE - sum) < temp){
                sum = 0;
                break;
            }else{
                sum += temp;
            }
        }
        if(x < 0){
            sum = sum * -1;
        }
        return sum;
    }
}
