package com.leliuchn.learn.leetcode;

import java.util.*;

/**
 * Created by leliuchn on 17/9/15.
 */
public class LongestPalindromicSubstring {

    public static void main(String args[]){
        String testStr = "aaaaaaaa";
        String maxString = longestPalindrome(testStr);
        System.out.println(maxString);
    }

    public static String longestPalindrome2(String s) {
        char[] scharArray = s.toCharArray();
        String maxString = "";

        Map<Character,List<Integer>> cacheCharacterIndex = new HashMap<Character, List<Integer>>();
        for(int i = 0; i < scharArray.length; i ++){
            if(cacheCharacterIndex.containsKey(scharArray[i])){
                List<Integer> indexList = cacheCharacterIndex.get(scharArray[i]);
                indexList.add(i);
                cacheCharacterIndex.put(scharArray[i],indexList);
            }else{
                List<Integer> indexList = new ArrayList<Integer>();
                indexList.add(i);
                cacheCharacterIndex.put(scharArray[i],indexList);
            }
        }
        return maxString;
    }


    public static String longestPalindrome(String s) {
        char[] scharArray = s.toCharArray();
        String maxString = "";
        int maxBeginIndex = 0;
        int maxEndIndex = 0;
        boolean equalLength = false;
        for(int i = 0 ; i < scharArray.length; i ++ ){
            for (int j = scharArray.length - 1; j >= 0; j--) {
                if (scharArray[i] != scharArray[j])
                    continue;
                if (maxBeginIndex < i && maxEndIndex > j)
                    continue;
                if (i <= j && isPalindromeFunction(i, j, scharArray)) {
                    if ((maxEndIndex - maxBeginIndex) < (j - i)) {
                        maxBeginIndex = i;
                        maxEndIndex = j;
                    }
                }
                if ((maxEndIndex - maxBeginIndex) == (scharArray.length - 1)) {
                    equalLength = true;
                    break;
                }
            }
            if(equalLength){
                break;
            }
        }
        if(equalLength)
            maxString = s;
        else
            maxString = s.substring(maxBeginIndex,maxEndIndex + 1);
        return maxString;
    }

    public static boolean isPalindromeFunction(int i,int j, char [] charArray){
        boolean isTrue = true;
        while (i <= j) {
            if (charArray[i] != charArray[j]) {
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
