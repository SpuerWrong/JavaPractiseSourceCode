package com.itheima;
public class Example21 {
    public static void main(String[] args){
        int result = divide(4,0);
        System.out.println(result);
    }
    //下面的方法实现了两个整数相乘
    public static int divide(int x,int y){
        int result = x/y;
        return result;
    }
}
