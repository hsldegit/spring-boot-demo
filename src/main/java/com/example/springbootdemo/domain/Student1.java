package com.example.springbootdemo.domain;

import java.io.Serializable;

public class Student1 implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -6834118551525523748L;

    private String no;

    private String name;

    private String sex1;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex1() {
        return sex1;
    }

    public void setSex1(String sex1) {
        this.sex1 = sex1;
    }

    @Override
    public String toString() {
        return "Student [no=" + no + ", name=" + name + "]";
    }

}
