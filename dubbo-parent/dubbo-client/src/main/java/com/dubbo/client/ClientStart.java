package com.dubbo.client;

import com.dubbo.domain.Student;
import com.dubbo.domain.StudentScore;
import com.dubbo.domain.StudentScores;
import com.dubbo.domain.User;
import com.dubbo.service.HelloWorldService;
import com.dubbo.service.StudentService;
import com.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@ImportResource("classpath:dubbo-client.xml")
@ComponentScan(basePackages = {"com.dubbo.domain"})
@RestController
public class ClientStart {

    @Autowired
    private HelloWorldService helloWorldService;

    @Autowired
    private UserService userService;

    @Autowired
    private StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(ClientStart.class);
    }

    @GetMapping("user")
    @ResponseBody
    public List<User> getUser(){
        return userService.findUser();
    }


    @PostMapping("/students")
    public Integer saveStudent(@RequestBody Student student) {
        Integer addNum = studentService.addStudent(student);
        return addNum;
    }

    @DeleteMapping("/students/{name}")
    public Integer deleteStudentByName(@PathVariable String name) {
        Integer deleteNum = studentService.deleteStudentByName(name);
        return deleteNum;
    }

    @DeleteMapping("/students")
    public Integer deleteStudentByStudent(@RequestBody Student student) {
        Integer deleteNum = studentService.deleteByStudent(student);
        return deleteNum;
    }

    @PutMapping("/students")
    public Integer updateStudent(@RequestBody Student student) {
        Integer updateNum = studentService.updateStudent(student);
        return updateNum;
    }

    @GetMapping("/students/{name}")
    public Student findStudentByName(@PathVariable String name) {
        Student student = studentService.findStudentByName(name);
        return student;
    }

    @GetMapping("/students")
    public List<Student> getStudentListByAgeAndSexAndHobbies() {
        List<Student> studentList = studentService.findStudents();
        return studentList;
    }

    @GetMapping("/students/map")
    public List<Student> findStudentByMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "Even");
        List<Student> studentList = studentService.findStudentByMap(map);
        return studentList;
    }

    @GetMapping("/students/{age}/{sex}")
    public List<Student> findStudentByAgeAndSex(@PathVariable Integer age, @PathVariable String sex) {
        List<Student> studentList = studentService.findStudentByAgeAndSex(age, sex);
        return studentList;
    }

    @GetMapping("/students/scores")
    public List<StudentScores> findStudentScores() {
        List<StudentScores> studentList = studentService.findStudentScores();
        return studentList;
    }

    @GetMapping("/students/score")
    public List<StudentScore> findStudentScore() {
        List<StudentScore> studentScores = studentService.findStudentScore();
        return studentScores;
    }

}
