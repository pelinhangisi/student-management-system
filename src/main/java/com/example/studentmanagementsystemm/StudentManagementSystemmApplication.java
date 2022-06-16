package com.example.studentmanagementsystemm;




import com.example.studentmanagementsystemm.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemmApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemmApplication.class, args);
    }
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

    }
}
