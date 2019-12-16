package com.dubbo.domain;


import java.io.Serializable;

public class HelloWorld implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
