package com.leliuchn.learn.leetcode;
import java.util.*;

/**
 * Created by leliuchn on 17/9/13.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        int[] indices = new int[list.size()];
        for(int p = 0; p < list.size(); p++){
            indices[p] = list.get(p);
        }
        return indices;
    }

    public int[] twoSum2(int[] nums, int target) {
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer,Integer> integers = new HashMap<Integer,Integer>();
        for(int i = 0;i < nums.length;i++){
            integers.put(nums[i],i);
        }
        Set<Integer> satisfiedIndices = new HashSet<Integer>();
        for(int i = 0;i < nums.length;i++){
            int diff = target - nums[i];
            if(satisfiedIndices.contains(diff))
                continue;;
            if(integers.containsKey(diff)){
                int j = integers.get(diff);
                if(i != j){
                    list.add(i);
                    list.add(j);
                    satisfiedIndices.add(nums[i]);
                }
            }
        }
        int[] indices = new int[list.size()];
        for(int p = 0; p < list.size(); p++){
            indices[p] = list.get(p);
        }
        return indices;
    }



    public static void main(String[] args){
        TwoSum twoSum = new TwoSum();
        int[] nums = {3,2,4};
        int target = 6;
        int[] indices = twoSum.twoSum2(nums,target);
        for(int i = 0 ;i < indices.length; i ++){
            System.out.print(indices[i] + " ");
        }
        System.out.println();
        for(int i = 0 ;i < indices.length; i ++){
            System.out.print(nums[indices[i]] + " ");
        }
    }
}
