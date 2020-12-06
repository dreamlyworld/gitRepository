package com.company.heap;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Chenweiwei
 * @Date 2020/10/23 10:03
 * @Version 1.0
 * 堆内存溢出演示 java.lang.OutOfMemoryError
 */
public class Heap1 {
    public static void main(String[] args) {
        int i = 0;
        try{
            List<String> list = new ArrayList<>();
            String a = "hello";
            while (true){
                list.add(a);
                a = a + a ;
                i++;
            }
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println(i);
        }
    }
}
