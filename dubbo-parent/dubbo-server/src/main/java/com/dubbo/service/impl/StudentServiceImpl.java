package com.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.domain.Student;
import com.dubbo.domain.StudentScore;
import com.dubbo.domain.StudentScores;
import com.dubbo.mapper.StudentMapper;
import com.dubbo.service.StudentService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public Integer addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public Integer deleteStudentByName(String name) {
        return studentMapper.deleteStudentByName(name);
    }

    @Override
    public Integer deleteByStudent(Student student) {
        return studentMapper.deleteByStudent(student);
    }

    @Override
    public Integer updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    @Override
    public Student findStudentByName(String name) {
        return studentMapper.findStudentByName(name);
    }

    @Override
    public List<Student> findStudents() {
        return studentMapper.findStudents();
    }

    @Override
    public List<Student> findStudentByMap(Map<String, String> map) {
        return studentMapper.findStudentByMap(map);
    }

    @Override
    public List<Student> findStudentByStudent(Student student) {
        return studentMapper.findStudentByStudent(student);
    }

    @Override
    public List<Student> findStudentByAgeAndSex(Integer age, String sex) {
        return studentMapper.findStudentByAgeAndSex(age,sex);
    }

    @Override
    public List<StudentScores> findStudentScores() {
        return studentMapper.findStudentScores();
    }

    @Override
    public List<StudentScore> findStudentScore() {
        return studentMapper.findStudentScore();
    }
}
