package com.leliuchn.learn.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leliuchn on 17/9/21.
 */
public class PalindromeNumber {

    public static void main(String args[]){
        boolean isPalindrome = isPalindrome(1234321);
        System.out.println(isPalindrome);
    }

    public static boolean isPalindrome(int x) {
        boolean isPalindromeNum = false;
        if(x < 0)
            return false;
        if(x >= 0 && x <= 9)
            return true;

        List<Integer> integerList = new ArrayList();
        int tmp = x;
        while(tmp !=0 ){
            int mod = Math.abs(tmp%10);
            integerList.add(mod);
            tmp =  tmp/10;
        }
        isPalindromeNum = isPalindromeFunction(0,integerList.size()-1,integerList);
        return isPalindromeNum;
    }

    public static boolean isPalindromeFunction(int i,int j, List<Integer> integerList){
        boolean isTrue = true;
        while (i <= j) {
            if (integerList.get(i) != integerList.get(j)) {
                isTrue = false;
                break;
            } else {
                i++;
                j--;
            }
        }
        return isTrue;
    }

}
