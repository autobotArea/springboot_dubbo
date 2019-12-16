package com.dubbo.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

@Data
@Accessors(chain = true)
public class StudentScores implements Serializable {
    private String name;
    private Integer age;
    private String sex;
    private List<Score> scoreList;
}
