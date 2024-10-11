package com.example.Lab6NTN.repository;

import com.example.Lab6NTN.models.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Students,Integer> {
    Students findById(Long id) ;

    static void deleteById(Long id) {
    }
}
