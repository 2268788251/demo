package com.wjb.demo;

public class TestJvm1 {
    private static int a = 3;

    static {
        a = 5;
    }

    public static void main(String[] args) {
        System.out.println(a);
    }
}
