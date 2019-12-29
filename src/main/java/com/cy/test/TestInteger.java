package com.cy.test;

/**
 * @author: 𝓛.𝓕.𝓠
 * 自动装箱、自动拆箱带来的 坑 ！！
 */
public class TestInteger {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c == d);//true
        System.out.println(e == f);//false
        System.out.println(c == (a+b));//true
        System.out.println(c.equals(a+b));//true
        System.out.println(g == (a+b));//true
        System.out.println(g.equals(a+b));//false
    }
}
