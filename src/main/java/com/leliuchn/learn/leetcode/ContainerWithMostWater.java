package com.leliuchn.learn.leetcode;

/**
 * Created by leliuchn on 17/9/25.
 */
public class ContainerWithMostWater {

    public static void main(String args[]){

        System.out.println("Hello,world");
    }

    ///这种暴力搜索的方式是基本的方式
    public static int maxArea(int[] height) {
        int maxAera = 0;
        for(int i = 0; i < height.length; i ++){
            if(height[i] == 0)
                continue;
            for(int j = i + 1; j < height.length; j++) {
                int area = 0;
                if(height[j] == 0)
                    continue;
                if(height[i] <= height[j]) {
                    area = height[i] * (j - i);
                    if (area > maxAera) {
                        maxAera = area;
                    }
                }else{
                    area = height[j] * (j - i);
                    if (area > maxAera) {
                        maxAera = area;
                    }
                }
            }
        }
        return maxAera;
    }


    ///正向多还是负向多，这种方式还是太慢
    public static int maxArea2(int[] height) {
        int maxAera = 0;
        int ascOrderCount = 0;
        int dscOrderCount = 0;
        for(int p = 0; p < height.length - 1; p ++){
            if(height[p] <= height[p + 1]){
                ascOrderCount ++;
            }else
                dscOrderCount ++;
        }
        if(ascOrderCount > dscOrderCount){
            for(int i = 0; i < height.length; i ++){
                if(height[i] == 0)
                    continue;
                for(int j = height.length - 1; j >= 0; j --) {
                    int area = 0;
                    if(height[j] == 0)
                        continue;

                    if(height[i] <= height[j]) {
                        area = height[i] * (j - i);
                        if (area > maxAera) {
                            maxAera = area;
                        }
                        break;
                    }else{
                        area = height[j] * (j - i);
                        if (area > maxAera) {
                            maxAera = area;
                        }
                    }
                }
            }
        }else{
            for(int j = height.length - 1; j >= 0; j --) {
                if (height[j] == 0)
                    continue;
                for (int i = 0; i < height.length; i++) {
                    int area = 0;
                    if (height[i] == 0)
                        continue;

                    if (height[j] <= height[i]) {
                        area = height[j] * (j - i);
                        if (area > maxAera) {
                            maxAera = area;
                        }
                        break;
                    } else {
                        area = height[i] * (j - i);
                        if (area > maxAera) {
                            maxAera = area;
                        }
                    }
                }
            }
        }
        return maxAera;
    }
}
