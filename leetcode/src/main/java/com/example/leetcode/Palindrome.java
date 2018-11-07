package com.example.leetcode;

/**
 * Created by zoup on 2018/11/7
 * E-Mail：2479008771@qq.com
 */
public class Palindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome(123321));
        System.out.println(isPalindrome(159753));
    }
    public static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        else{
            int result=Reverse.reverse(x);
            return result==x;
        }
    }
}
