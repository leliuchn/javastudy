package com.leliuchn.learn.leetcode;

import java.util.*;

/**
 * Created by leliuchn on 17/9/28.
 */
public class ThreeSum {

    public static void main(String args[]) {
        System.out.println("Hello,world");
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> listList = threeSum(nums);
        for (List<Integer> integerList : listList) {
            for (Integer integer : integerList) {
                System.out.print(integer + ",");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        HashSet<ArrayList<Integer>> hs = new HashSet<ArrayList<Integer>>();
        Arrays.sort(num);
        for(int i = 0; i <= num.length-3; i++){
            int low = i+1;
            int high = num.length-1;
            while(low<high) {//since they cannot be the same one, low should not equal to high
                int sum = num[i] + num[low] + num[high];
                if (sum == 0) {
                    ArrayList<Integer> unit = new ArrayList<Integer>();
                    unit.add(num[i]);
                    unit.add(num[low]);
                    unit.add(num[high]);
                    if (!hs.contains(unit)) {
                        hs.add(unit);
                        res.add(unit);
                    }
                    low++;
                    high--;
                } else if (sum > 0)
                    high--;
                else
                    low++;
            }
        }
        return res;
    }

}
