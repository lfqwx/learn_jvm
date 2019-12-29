package com.cy.test;

/**
 * @author: 𝓛.𝓕.𝓠
 * 测试局部变量表的回收
 * VM options: -verbose:gc 可以查看gc信息
 */
public class TestSlot {
    public static void main(String[] args) {
        //加括号的目的是让PC计数器脱离placeholder作用范围
        {
            byte[] placeholder = new byte[64 * 1024 * 1024];
        }
        //加上这个变量赋值的动作，是为了复用Slot，从而触发gc
        int a = 0;
        System.gc();//还必须写这个，不然在main结束前，不会打印gc信息。
    }
}
