package com.example.leetcode;

/**
 * Created by zoup on 2018/11/7
 * E-Mail：2479008771@qq.com
 */
public class Reverse {

    public static int reverse(int x){
        int result=0;
        for(;x!=0;x/=10){
            result=result*10+x%10;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.print(reverse(13579));
    }
}
