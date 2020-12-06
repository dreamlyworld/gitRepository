package com.company.heap;

/**
 * @Author Chenweiwei
 * @Date 2020/10/23 10:26
 * @Version 1.0
 */
public class Heap2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("1.......");
        Thread.sleep(300000);
        Byte[] array = new Byte[1000 * 1000 * 10];
        System.out.println("2.......");
        Thread.sleep(300000);
        array=null;
        System.gc();
        System.out.println("3.......");
        Thread.sleep(3000000L);

    }
}
