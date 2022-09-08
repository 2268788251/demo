package com.wjb.demo;

import java.net.URL;
import java.net.URLClassLoader;

public class CustomClassLoader extends URLClassLoader {

    public CustomClassLoader(URL[] urls) {
        super(urls);
    }

    public static void main(String[] args) throws ClassNotFoundException {


    }
}
