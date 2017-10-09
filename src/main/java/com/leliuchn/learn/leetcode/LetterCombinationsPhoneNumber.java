package com.leliuchn.learn.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leliuchn on 17/10/9.
 */
public class LetterCombinationsPhoneNumber {

    public static void main(String args[]){
        System.out.println("Hello,world");
        letterCombinations("2");
    }

    public static List<String> letterCombinations(String digits) {
        List<String> stringList = new ArrayList<String>();
        char[] digitsCharArray = digits.toCharArray();
        for(int i = 0; i < digitsCharArray.length; i ++){
            char[] strCharArray = toString(digitsCharArray[i]).toCharArray();
            if(i == 0){
                for(int j = 0; j < strCharArray.length;j ++){
                    stringList.add(String.valueOf(strCharArray[j]));
                }
            }else{
                 stringList = combineString(strCharArray,stringList);
            }
        }
        return stringList;
    }

    public static List<String> combineString(char[] strCharArray,List<String> stringList) {
        List<String> tmpStringList = new ArrayList<String>();
        int tempSize = stringList.size();
        for (int j = 0; j < tempSize; j++) {
            String strTmp = stringList.get(j);
            for (int i = 0; i < strCharArray.length; i++) {
                String combineStr = strTmp + String.valueOf(strCharArray[i]);
                tmpStringList.add(combineStr);
            }
        }
        return tmpStringList;
    }

    public static String toString(char ch) {
        switch (ch) {
            case '2':
                return "abc";
            case '3':
                return "def";
            case '4':
                return "ghi";
            case '5':
                return "jkl";
            case '6':
                return "mno";
            case '7':
                return "pqrs";
            case '8':
                return "tuv";
            case '9':
                return "wxyz";
        }
        return "";
    }
}
