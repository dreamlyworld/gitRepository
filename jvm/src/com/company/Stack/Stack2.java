package com.company.Stack;

import java.io.PrintStream;

/**
 * @Author Chenweiwei
 * @Date 2020/10/22 16:35
 * @Version 1.0
 *
 * 2.	栈帧过大造成内存溢出
 */
public class Stack2 {
    static int count = 0;
    public static void main(String[] args) {
        try {
            method2(20,10);
        }catch (Throwable e){
            e.printStackTrace();
            PrintStream printStream = System.out;
            printStream.println(count);
        }
    }
    public  static  void method2(int a,int b){
        count++;
        int c = a + b;
        int d = a - b;
        method2(c,d);

    }
}
