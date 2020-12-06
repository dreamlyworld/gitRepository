package com.company.Stack;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Chenweiwei
 * @Date 2020/10/22 16:43
 * @Version 1.0
 */
public class Stack3 {
    public static void main(String[] args) throws JsonProcessingException {
        Dept dept = new Dept();
        dept.setName("market");

        Emp e1 = new Emp();
        e1.setName("陈");
        e1.setDept(dept);

        Emp e2 = new Emp();
        e2.setName("张");
        e2.setDept(dept);

        dept.setEmpList(Arrays.asList(e1,e2));

        ObjectMapper objectMapper = new ObjectMapper();
        PrintStream printStream = System.out;
        printStream.println(objectMapper.writeValueAsString(dept));


    }
}

class Emp{
    private  String name;
    @JsonIgnore
    private Dept dept;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
class Dept{
    private  String name;
    private List<Emp> empList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }
}
