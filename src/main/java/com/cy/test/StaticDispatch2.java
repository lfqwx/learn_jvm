package com.cy.test;

/**
 * @author: 𝓛.𝓕.𝓠
 */
public class StaticDispatch2 {
    static class StaticDispatchMan extends StaticDispatch2{
        @Override
        public void sayHello(StaticDispatch2 s) {
            System.out.println("StaticDispatchMan的方法！");
        }
    }
    static class StaticDispatchWoman extends StaticDispatch2{
        @Override
        public void sayHello(StaticDispatch2 s) {
            System.out.println("StaticDispatchWoman的方法！");
        }
    }

    //父类StaticDispatch2的方法
    public void sayHello(StaticDispatch2 s){
        System.out.println("StaticDispatch2的方法！");
    }

    public static void main(String[] args) {
        StaticDispatch2 s = new StaticDispatch2();
        StaticDispatch2 man = new StaticDispatchMan();
        StaticDispatch2 woman = new StaticDispatchWoman();
        man.sayHello(s);
        woman.sayHello(s);
        System.out.println("----------");
        System.out.println("a".hashCode());//97
        System.out.println('a'=="a".hashCode());//true
        System.out.println("a".equals('a'));//false


    }

}
