package com.cy.test;

/**
 * @author: 𝓛.𝓕.𝓠
 * 静态分派：编译期间，决定使用哪个重载方法。Human man = new Man();由父类型引用决定
 * 输出为：hello,guy!
         hello,guy!
 */
public class StaticDispatch {
    static abstract class Human {
    }

    static class Man extends Human {

    }

    static class WoMan extends Human {
    }

    public void sayHello(Human guy) {
        System.out.println("hello,guy!");
    }

    public void sayHello(Man guy) {
        System.out.println("hello,gentleman!");
    }

    public void sayHello(WoMan guy) {
        System.out.println("hello,lady!");
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human woMan = new WoMan();
        StaticDispatch sr = new StaticDispatch();

        sr.sayHello(man);//hello,guy!
        sr.sayHello(woMan);//hello,guy!

        System.out.println("------------");
        man = new WoMan();
        //sr.sayHello((Man) man);//子类间不能类型转换
        sr.sayHello((WoMan) woMan);//hello,lady!
    }
}
