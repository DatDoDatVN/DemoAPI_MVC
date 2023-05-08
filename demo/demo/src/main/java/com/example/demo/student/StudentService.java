package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Dat",
                        "datcl@202",
                        LocalDate.of(2002, Month.NOVEMBER, 21),
                        20
                )
        );
    }
}
