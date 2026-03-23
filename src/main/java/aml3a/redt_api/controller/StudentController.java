package aml3a.redt_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import aml3a.redt_api.model.Student;
import aml3a.redt_api.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService service;

    // GET all students
    @GetMapping
    public List<Student> getStudents() {
        return service.getAllStudents();
    }

    // GET student by ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return service.getStudentById(id);
    }

    // CREATE student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    // UPDATE student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
        student.setId(id);
        return service.saveStudent(student);
    }
}

 