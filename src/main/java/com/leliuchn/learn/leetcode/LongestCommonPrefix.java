package com.leliuchn.learn.leetcode;

import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry;

import javax.management.StringValueExp;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by leliuchn on 17/9/26.
 */
public class LongestCommonPrefix {

    public static void main(String args[]){
        String [] temp = new String[]{"abca","abc"};
        String lcp = longestCommonPrefix(temp);
        System.out.println(lcp);
    }

    public static String longestCommonPrefix(String[] strs) {

        Map<String,Integer> charIndexCount = new HashMap<String,Integer>();
        Map<Integer,String> indexAndValue = new HashMap<Integer, String>();
        String [] longestCommonTmp = new String[strs.length];
        if(strs.length == 0)
            return "";
        if(strs.length == 1)
            return strs[0];
        else{
            for(int i = 0 ; i < strs.length; i ++){
                if(strs[i].equals("")){
                    return "";
                }
                char[] tmpArray = strs[i].toCharArray();
                for(int j = 0 ; j < tmpArray.length; j ++) {
                    String key = new StringBuffer().append(j).append("_").append(tmpArray[j]).toString();
                    if(charIndexCount.containsKey(key)){
                        int count = charIndexCount.get(key);
                        count = count + 1;
                        charIndexCount.put(key,count);
                    }else{
                        charIndexCount.put(key,1);
                    }
                }
            }

            int count = 0;
            for(Map.Entry<String,Integer> entry : charIndexCount.entrySet()){
                int value = entry.getValue();
                if(value != strs.length){
                    continue;
                }else{
                    String [] indexValue = entry.getKey().split("_");
                    int index = Integer.parseInt(indexValue[0]);
                    indexAndValue.put(index,indexValue[1]);
                    count++;
                }
            }
            StringBuffer sb = new StringBuffer();
            for(int i = 0 ; i < count; i ++){
                if(indexAndValue.containsKey(i)) {
                    sb.append(indexAndValue.get(i));
                }else
                    break;
            }

            if(sb.toString().equals("null"))
                return "";

            return sb.toString();
        }
    }

    public static String longestCommonPrefix2(String[] strs) {

        Map<String,Integer> charIndexCount = new HashMap<String,Integer>();
        Map<Integer,String> indexAndValue = new HashMap<Integer, String>();
        String [] longestCommonTmp = new String[strs.length];
        if(strs.length == 0)
            return "";
        if(strs.length == 1)
            return strs[0];
        else{
            for(int i = 0 ; i < strs.length; i ++){
                if(strs[i].equals("")){
                    return "";
                }
                char[] tmpArray = strs[i].toCharArray();
                for(int j = 0 ; j < tmpArray.length; j ++) {
                    String key = new StringBuffer().append(j).append("_").append(tmpArray[j]).toString();
                    if(charIndexCount.containsKey(key)){
                        int count = charIndexCount.get(key);
                        count = count + 1;
                        charIndexCount.put(key,count);
                    }else{
                        charIndexCount.put(key,1);
                    }
                }
            }

            int count = 0;
            for(Map.Entry<String,Integer> entry : charIndexCount.entrySet()){
                int value = entry.getValue();
                if(value != strs.length){
                    continue;
                }else{
                    String [] indexValue = entry.getKey().split("_");
                    int index = Integer.parseInt(indexValue[0]);
                    indexAndValue.put(index,indexValue[1]);
                    count++;
                }
            }
            StringBuffer sb = new StringBuffer();
            for(int i = 0 ; i < count; i ++){
                if(indexAndValue.containsKey(i)) {
                    sb.append(indexAndValue.get(i));
                }else
                    break;
            }

            if(sb.toString().equals("null"))
                return "";

            return sb.toString();
        }
    }
}

//a (1 1) (2 1) (3 1)
//
//a count
//0_a count
