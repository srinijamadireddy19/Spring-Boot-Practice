package com.example.CrudDemo.service;

import com.example.CrudDemo.repository.StudentRepository;
import java.util.List;
import com.example.CrudDemo.entity.Student;
import org.springframework.stereotype.Service;
//import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentById(Long id) {

        return studentRepository.findById(id).get();
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudentById(long id) {
        studentRepository.deleteById(id);
    }

    // public List<Student> searchByName(String name) {
    //     return studentRepository
    // }
}
