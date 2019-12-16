package com.dubbo.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class Score implements Serializable {
    private Integer scoreId;
    private Integer studentId;
    private String studentName;
    private String subject;
    private Integer subjectScore;
}
