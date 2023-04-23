package com.tpe.repository;

import com.tpe.domain.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@Component
@Repository// Repository annotation'ı ile SpringFramework'e Database ile iletişime geçeceğimi söylemiş oluyorum.
public class StudentRepositoryImpl implements StudentRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Student student) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.saveOrUpdate(student); // db de boyle bir kayit varsa update eder, yoksa kaydeder.

        tx.commit();
        session.close();
//        sessionFactory.close(); sessionFactory yonetimi Springde o yuzden bizim kapatmamiza gerek yok.
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Optional<Student> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }

}