package com.wjb.demo;

public class TestJVM {
    static {
        a = 5;
    }
    private static int a = 3;
    public static void main(String[] args) {
        new Thread(()->{
            Demo demo = new Demo();
        });
        Demo demo = new Demo();

    }
    static class Demo{
        static {
            System.out.println("加载");
            if (true){
                while (true){

                }
            }
        }
    }
}
