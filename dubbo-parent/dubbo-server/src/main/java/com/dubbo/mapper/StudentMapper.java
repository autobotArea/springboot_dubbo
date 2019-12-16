package com.dubbo.mapper;

import com.dubbo.domain.Student;
import com.dubbo.domain.StudentScore;
import com.dubbo.domain.StudentScores;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudentMapper {

    Integer addStudent(Student student);

    Integer deleteStudentByName(String name);

    Integer deleteByStudent(Student student);

    Integer updateStudent(Student student);

    Student findStudentByName(String name);

    List<Student> findStudents();

    List<Student> findStudentByMap(Map<String, String> map);

    List<Student> findStudentByStudent(Student student);

    List<Student> findStudentByAgeAndSex(Integer age, String sex);

    List<StudentScores> findStudentScores();

    List<StudentScore> findStudentScore();
}
