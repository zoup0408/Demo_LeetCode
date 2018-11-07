package com.example.leetcode;

/**
 * Created by zoup on 2018/11/7
 * E-Mail：2479008771@qq.com
 */
public class TwoSum {
    public static void main(String[] args){

    }
    public static int[] twoSum(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{nums[i],nums[j]};
                }
            }
        }
        return null;
    }
}
