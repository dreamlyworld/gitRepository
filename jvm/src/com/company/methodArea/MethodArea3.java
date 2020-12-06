package com.company.methodArea;

/**
 * @Author Chenweiwei
 * @Date 2020/10/30 14:42
 * @Version 1.0
 */
//Stringtable[a,b,ab]不可扩容，哈希表结构
public class MethodArea3 {

    //常量池中的信息都会被加载到运行时常量池，这时的a，b,ab都是常量池中的符号,还没有变为java字符串对象。
    //当执行到0：ldc时，会把a 符号变为"a"字符串对象
    //先在串池中找a,如果没有，会将其加入到串池
    //注意：执行到相应代码时下回加入到串池
    public static void main(String[] args) {
        String  s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        String s4 = s1 + s2;
        String s5 = "a" + "b";
        String s6 = s1 + "b";
        String s7 =  "a"+ s2;
        System.out.println("hello world");
        System.out.println(s3 == s4);
        System.out.println(s6 == s7);
    }
}
