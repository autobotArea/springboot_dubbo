package com.dubbo.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class StudentScore implements Serializable {
    private String name;
    private Integer age;
    private String sex;
    private Score score;
}
