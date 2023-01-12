package com.ignaciocassi.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

import static com.ignaciocassi.demo.student.Student.Gender.MALE;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        return List.of(
                new Student(UUID.randomUUID(), "Daniel Ignacio", "Cassi", "dignaciocassi@gmail.com", MALE),
                new Student(UUID.randomUUID(), "Juan Carlos","Martinez","juancarlosmartinez@gmail.com",MALE));
    }

}
