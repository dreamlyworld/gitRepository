package com.company;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        method1();
    }

    public  static  void method1(){
        int  c =  method2(1,2);
        PrintStream printStream = System.out;
        printStream.println(c);
    }

    public  static  int  method2(int a,int b){
        return a + b ;

    }
}
