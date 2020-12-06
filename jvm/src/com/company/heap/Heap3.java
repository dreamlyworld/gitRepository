package com.company.heap;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Chenweiwei
 * @Date 2020/10/23 10:26
 * @Version 1.0
 */
public class Heap3 {
    public static void main(String[] args) throws InterruptedException {
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            list.add(new Student());
        }
        LocalDate localDate =  LocalDate.now();
        System.out.println("当前时间："+localDate);
        Thread.sleep(10000000L);

    }
}
class Student{
    private Byte[] array = new Byte[1000 * 1000 * 1];
}
