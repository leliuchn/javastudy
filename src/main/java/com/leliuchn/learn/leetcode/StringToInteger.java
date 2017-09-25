package com.leliuchn.learn.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leliuchn on 17/9/20.
 */
public class StringToInteger {


    public static void main(String args[]){
        int num = myAtoi("18446744073709551617");
        System.out.println(num);

    }
    public static int myAtoi(String str) {
        List<Integer> num = new ArrayList<Integer>();
        int sum = 0;
        int j = 0;
        boolean isNegativeNum = false;
        boolean isPositiveNum = false;
        int negativeCount = 0;
        int positiveCount = 0;
        char[] strArray = str.toCharArray();
        if(strArray.length > 0){
            for(int i = 0; i < strArray.length; i ++){
                if(strArray[i] == '-' && j == 0){
                    isNegativeNum = true;
                    negativeCount ++;
                    continue;
                }
                if(strArray[i] == '+' && j == 0){
                    isPositiveNum = true;
                    positiveCount ++;
                    continue;
                }
                if(strArray[i] >='0' &&  strArray[i] <='9'){
                    num.add(strArray[i] - '0');
                    j ++;
                }else if (!isNegativeNum && !isPositiveNum && strArray[i] == ' ' && j == 0){
                    continue;
                }
                else{
                    break;
                }
            }
        }
        if(isNegativeNum && isPositiveNum) {
            return sum;
        }

        if(negativeCount > 1 || positiveCount > 1){
            return sum;
        }

        long ten = 1;
        if(isNegativeNum){
            for(int p = num.size() - 1; p >= 0; p--, ten = ten * 10){
                long tmp = Integer.MIN_VALUE - sum;
                long tmpSum = -1*num.get(p) * ten;
                if (tmp > tmpSum) {
                    sum = Integer.MIN_VALUE;
                    return sum;
                } else {
                    sum += tmpSum;
                }
            }
        }else{
            for(int p = num.size() - 1; p >= 0; p--, ten = ten * 10){
                long tmp = Integer.MAX_VALUE - sum;
                long tmpSum = num.get(p) * ten;
                if (tmp < tmpSum) {
                    sum = Integer.MAX_VALUE;
                    return sum;
                } else {
                    sum += tmpSum;
                }
            }

        }
        return sum;
    }
}
