package com.leliuchn.learn.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leliuchn on 17/9/22.
 */
public class RomanNumberToInteger {
    public static Map<Integer,String> intToRoman = new HashMap<Integer, String>(){{
        put(1,"I");
        put(2,"II");
        put(3,"III");
        put(4,"IV");
        put(5,"V");
        put(6,"VI");
        put(7,"VII");
        put(8,"VIII");
        put(9,"IX");
        put(10,"X");
        put( 20,"XX");
        put( 30,"XXX");
        put( 40,"XL");
        put( 50,"L");
        put( 60,"LX");
        put( 70,"LXX");
        put( 80,"LXXX");
        put( 90,"XC");
        put( 100,"C");
        put( 200,"CC");
        put( 300,"CCC");
        put( 400,"CD");
        put( 500,"D");
        put( 600,"DC");
        put( 700,"DCC");
        put( 800,"DCCC");
        put( 900,"CM");
        put( 1000,"M");
        put( 2000,"MM");
        put( 3000,"MMM");
    }};
    public static void main(String args[]) {

        String tmp1 = "I";
        String tmp2 = "MMMCMXCIX";
        int romanNum = romanToInt(tmp1);
        String roman = intToRoman(1);
        System.out.println("Hello,world " + romanNum  + "\t" + roman);

    }

    public static int romanToInt(String s) {
        char[] romanArray = s.toCharArray();
        int sum = 0;
        int i = 0;
        for (int j = 1; i < romanArray.length && j < romanArray.length; i++, j++) {
            int romanNum1 = toNumber(romanArray[i]);
            int romanNum2 = toNumber(romanArray[j]);
            if (romanNum1 >= romanNum2) {
                sum = sum + romanNum1;
            } else {
                sum = sum + romanNum2 - romanNum1;
                i++;
                j++;
            }
        }

        if (i < romanArray.length) {
            sum += toNumber(romanArray[i]);
        }

        return sum;
    }

    public static int toNumber(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }

    public static String toString(int num) {
        switch (num) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";
            case 20:
                return "XX";
            case 30:
                return "XXX";
            case 40:
                return "XL";
            case 50:
                return "L";
            case 60:
                return "LX";
            case 70:
                return "LXX";
            case 80:
                return "LXXX";
            case 90:
                return "XC";
            case 100:
                return "C";
            case 200:
                return "CC";
            case 300:
                return "CCC";
            case 400:
                return "CD";
            case 500:
                return "D";
            case 600:
                return "DC";
            case 700:
                return "DCC";
            case 800:
                return "DCCC";
            case 900:
                return "CM";
            case 1000:
                return "M";
            case 2000:
                return "MM";
            case 3000:
                return "MMM";
        }
        return "";
    }


    public static String intToRoman(int num) {

        StringBuffer sb = new StringBuffer();
        List<String> romanStringList = new ArrayList<String>();
        int tmp = num;
        int ten = 1;
        while(tmp !=0 ){
            int mod = Math.abs(tmp%10);
            int modTmp = mod * ten;
            romanStringList.add(intToRoman.get(modTmp));
            tmp /= 10;
            ten *= 10;
        }

        for(int j = romanStringList.size() - 1; j >= 0 ;j --){
            sb.append(romanStringList.get(j));
        }

        return sb.toString();
    }


}
