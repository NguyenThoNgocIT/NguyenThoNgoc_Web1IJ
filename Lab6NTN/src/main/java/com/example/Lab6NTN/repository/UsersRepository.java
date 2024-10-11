package com.example.Lab6NTN.repository;

import com.example.Lab6NTN.models.Users;
import com.example.Lab6NTN.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findById(long id);
}







