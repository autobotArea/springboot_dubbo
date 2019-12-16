package com.dubbo.domain;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@Builder
public class Student implements Serializable {
    private Integer studentId;
    private String name;
    private Integer age;
    private String sex;
    private String hobbies;
    private String address;
}

