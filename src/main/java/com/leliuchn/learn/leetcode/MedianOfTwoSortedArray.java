package com.leliuchn.learn.leetcode;

/**
 * Created by leliuchn on 17/9/15.
 */
public class MedianOfTwoSortedArray {

    public static void main(String args[]){
        System.out.println("test");
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double median = findMedianSortedArrays(nums1,nums2);
        System.out.println(median);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0.0;
        int m = nums1.length;
        int n = nums2.length;
        int[] twoSortedArray = new int[m + n];
        int i = 0;
        int j = 0;
        int count = i;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                twoSortedArray[count] = nums1[i];
                i++;
                count++;
            } else {
                twoSortedArray[count] = nums2[j];
                j++;
                count++;
            }
        }

        while (i < m) {
            twoSortedArray[count] = nums1[i];
            i++;
            count++;
        }

        while (j < n) {
            twoSortedArray[count] = nums2[j];
            j++;
            count++;
        }
        if((m+n)%2==0){
            int index = (m+n)/2;
            median = (twoSortedArray[index] + twoSortedArray[index-1])/2.0;
        }else{
            int index = (m+n)/2;
            median = twoSortedArray[index];
        }

        return median;
    }
}
