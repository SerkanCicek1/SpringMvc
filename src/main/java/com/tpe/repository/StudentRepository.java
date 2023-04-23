package com.tpe.repository;

import com.tpe.domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {

    void save(Student student);
    List<Student> findAll();
    Optional<Student> findById(Long id); // return type Student yaparsak NullPointerException aliriz.
    // Optional kullandigimizda null yerine bos bir Optional object dondurur.
    void delete(Long id);

}