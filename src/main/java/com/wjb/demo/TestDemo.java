package com.wjb.demo;

public class TestDemo {
    public static void main(String[] args) {
        for (int i = 3; i >= 0; i--) {
            try {
                System.out.println(Runtime.getRuntime().maxMemory());
                System.out.println(Runtime.getRuntime().totalMemory());
                System.out.println(Runtime.getRuntime().freeMemory());
                int[] arr = new int[Integer.MAX_VALUE - i];
                System.out.println(Runtime.getRuntime().maxMemory());
                System.out.println(Runtime.getRuntime().totalMemory());
                System.out.println(Runtime.getRuntime().freeMemory());
                System.out.println();
                System.out.format("Successfully initialized an array with %,d elements.\n", Integer.MAX_VALUE / 4 - i);
            } catch (Throwable t) {
                t.printStackTrace();
            }
}
    }
}
