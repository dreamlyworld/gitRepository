package com.company.methodArea;

/**
 * @Author Chenweiwei
 * @Date 2020/11/2 11:47
 * @Version 1.0
 */
public class MethodArea6 {
    //-Xmx10m -XX:+PrintStringTableStatistics -XX:PrintGCDetails -verbose:gc
    //Xmx10m 设置虚拟机堆内存最大值
    //-XX:+PrintStringTableStatistics 统计字符表的基本信息
    //-XX:PrintGCDetails -verbose:gc 打印垃圾回收的详细信息
    public static void main(String[] args)  throws  InterruptedException{
        int i = 0 ;
        try {
            for (int j = 0; j <10000 ; j++) {
                String.valueOf(j).intern();
                i++;
            }
        }catch (Throwable e){
              e.printStackTrace();
        }finally {
            System.out.println(i);
        }

    }
}
