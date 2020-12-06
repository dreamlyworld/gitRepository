package com.company.methodArea;

/**
 * @Author Chenweiwei
 * @Date 2020/11/2 10:36
 * @Version 1.0
 */
//jdk1.8
public class MethodArea5 {

    public static void main(String[] args) {
       // String x = "ab";
        String x1 =  new String("a");
        String x2 =  new String("a");

        System.out.println(x1.equals(x2));
        String c = new String("a") + new String("b");
        String d = c.intern(); //将这个字符串对象尝试放入串池，如果有则不会放入,并将d指向串池中的ab，没有将会放进去，并返回串池对象。
        System.out.println(c == d);
        //System.out.println(d == x);
    }
}
