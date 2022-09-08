package com.wjb.demo;

public class Demo01 {
//    public static void main(String[] args) {
//        String str = "\t\t\t\t";
//        String[] split = str.split("\t",5);
//        System.out.println(split.length);
//    }
    public static void main(String[] args) {
        String str = "82e1340ba3ca4f3df51612e222713b01\u0001\u00011fe903a9ed659061358a87718b91c0c9\u00011fe903a9ed659061358a87718b91c0c9\u0001f6a57803790724d340dfc3bb81e1b0df\u0001a08b8e9bb9d7d44ca375b7057afa88ba\u0001重庆市渝西水利电力勘测设计院有限公司\u00015001181711130202\u0001永川区新城东岳河及其支流综合景观工程\u0001重庆市-市辖区-永川区\u0001市政工程\u00015000001711130295\u0001新建\u0001风景园林\u0001\u0001\u0001\u0001\u0001";
        String[] split = str.split("\\\u0001",19);
        System.out.println(split.length);
        for (String s : split) {
            System.out.println(s);
        }
    }
}
