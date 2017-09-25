package com.leliuchn.learn.leetcode;

import java.util.*;

/**
 * Created by leliuchn on 17/9/16.
 */
public class ZigZagConversion {

    public static void main(String args[]){
        System.out.println("Hello,world");
        String s = "PAYPALISHIRING";
        String zigZagStr = convert(s, 3);
        System.out.println(zigZagStr);
    }


    // P AYP A LIS H IRI N G"
    // 0     4     8    12  3
    //
    ///PAHNAPLSIIGYIR
    public static String convert(String s, int numRows) {
        char[] charArray = s.toCharArray();
        String ziZagStr = "";
        int newNumRows = numRows;
        if(charArray.length <= numRows){
            ziZagStr = s;
        }

        Map<Integer,StringBuffer> indexStr = new HashMap<Integer, StringBuffer>();
        Set<Integer> indexSet = new HashSet<Integer>();
        int tmp = 0;
        for(int index = 0 ; index < charArray.length; index++ ) {
            for(int i = 0; i < numRows; i ++){
                if(index < i)
                    break;
                if(((index - i )%2 == 0) && tmp < (newNumRows - 1)){
                    if(i >= tmp) {
                        if (!indexSet.contains(index)) {
                            StringBuffer sb = null;
                            if (indexStr.containsKey(i)) {
                                sb = indexStr.get(i);
                            } else {
                                sb = new StringBuffer();
                            }
                            indexSet.add(index);
                            sb.append(String.valueOf(charArray[index]) + " ");
                            indexStr.put(i, sb);
                            tmp = i;
                        }
                    }
                    if(tmp == (newNumRows - 1))
                        tmp --;
                }
            }
        }

        Iterator iterator = indexStr.keySet().iterator();
        while(iterator.hasNext()){
            String key = iterator.next().toString();
            System.out.println(key);
            System.out.println(indexStr.get(0).toString());
        }

//        for(int i = 0 ; i < indexStr.keySet().size(); i ++){
//            String value = indexStr.get(i).toString();
//            System.out.println(value);
//        }

        return ziZagStr;
    }

    public static String convert2(String s, int numRows) {
        char[] charArray = s.toCharArray();
        String ziZagStr = "";
        int newNumRows = numRows;
        if(charArray.length <= numRows){
            ziZagStr = s;
        }

        Map<Integer,StringBuffer> indexStr = new HashMap<Integer, StringBuffer>();
        Set<Integer> indexSet = new HashSet<Integer>();
        for(int index = 0 ; index < charArray.length; index++ ) {
            indexSet.add(index);
        }
        for(int i = 0; i < numRows; i ++){
            for(int j = 0 ; j < charArray.length; j ++){
                int sum = i + j * 2;
                if(indexSet.contains(sum)){
                    StringBuffer sb = null;
                    if(indexStr.containsKey(sum)) {
                        sb = indexStr.get(sum);
                    }else{
                        sb = new StringBuffer();
                    }
                    sb.append(String.valueOf(i + "_" + j + " "));
                    indexStr.put(sum,sb);
                }
            }
        }



        for(int i = 0 ; i < indexStr.keySet().size(); i ++){
            String value = indexStr.get(i).toString();
            System.out.println(value);
        }

        return ziZagStr;
    }

}
