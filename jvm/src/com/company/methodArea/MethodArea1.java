package com.company.methodArea;

import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

/**
 * @Author Chenweiwei
 * @Date 2020/10/30 9:54
 * @Version 1.0
 * 源空间内存溢出
 * -XX:MaxMetaspaceSize=8m
 */

//ClassLoader:可以用来加载类的二进制字节码
public class MethodArea1 extends  ClassLoader {

    public static void main(String[] args) {
        int j = 0;
        try {

            MethodArea1 methodArea1 = new MethodArea1();
            for (int i = 0;i < 10000 ;i++,j++) {
                //ClassWriter用来生产累的二进制字节码
                ClassWriter cw = new ClassWriter(0);
                //参数：java版本号，public,类名，包名，父类，接口。
                cw.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, "Class" + i,null, "java/lang/Object", null);
                //返回byte数组
                byte[] code = cw.toByteArray();
                //执行了累的加载
                methodArea1.defineClass("Class"+i,code,0,code.length);
            }
        }finally {
            System.out.println(j);

        }



    }



}
