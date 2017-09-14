package com.leliuchn.learn.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leliuchn on 17/9/14.
 */
public class LongestSubString {

    public static void main(String args[]){
        System.out.println(lengthOfLongestSubstring("abdcgedghshgjkl"));
    }
    public static int lengthOfLongestSubstring(String s) {
        char[] charArray = s.toCharArray();
        int maxStrLength = 0;
        for(int i = 0 ;i < charArray.length; i++){
            Map<Character,Integer> charIndex = new HashMap<Character,Integer>();
            charIndex.put(charArray[i],i);
            for(int j = i + 1; j < charArray.length; j++ ){

                if(charIndex.containsKey(charArray[j])){
                    i = charIndex.get(charArray[j]);
                    break;
                }else{
                    charIndex.put(charArray[j],j);
                }
            }
            int sbLength = charIndex.size();
            if(sbLength == s.length())
                return s.length();
            if(sbLength > maxStrLength){
                maxStrLength = sbLength;
            }
        }
        return maxStrLength;
    }
}
