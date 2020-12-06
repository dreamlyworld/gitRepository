package com.company.methodArea;

/**
 * @Author Chenweiwei
 * @Date 2020/11/2 15:02
 * @Version 1.0
 */
// -Xms500m -Xmx500m -XX:+PrintStringTableStatistics -XX:StringTableSize=1009
//stringtable性能调优


public class MethodArea7 {

    
    public static void main(String[] args)  throws  InterruptedException{
        System.out.println(args[0]);
    }
}
