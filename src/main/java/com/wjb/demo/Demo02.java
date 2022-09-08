package com.wjb.demo;

public class Demo02 {
    public static void main(String[] args) {
        // sun.misc.Launcher$AppClassLoader@18b4aac2
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        // sun.misc.Launcher$ExtClassLoader@6ff3c5b5
        ClassLoader parentClassLoader = systemClassLoader.getParent();
        System.out.println(parentClassLoader);
        // null
        ClassLoader parent = parentClassLoader.getParent();
        System.out.println(parent);
        Demo02 demo02 = new Demo02();// sun.misc.Launcher$AppClassLoader@18b4aac2
        ClassLoader classLoader = demo02.getClass().getClassLoader();
        System.out.println(classLoader);

    }
}
