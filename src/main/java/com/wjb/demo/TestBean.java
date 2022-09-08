package com.wjb.demo;

public class TestBean {
    public static Integer age;
    public final static String name = "张三";

    static {
        System.out.println("我被初始化了");
    }
}
