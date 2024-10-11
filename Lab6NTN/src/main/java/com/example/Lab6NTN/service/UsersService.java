package com.example.Lab6NTN.service;

import com.example.Lab6NTN.models.Users;
import com.example.Lab6NTN.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {
    @Autowired
    public static UsersRepository usersRepository;

    public List<Users> ShowList() {
        return usersRepository.findAll();
    }

    public List<Users> showList() {
        return usersRepository.findAll();
    }
    public Users findById(Long id) throws Exception {
        Optional<Users> users = usersRepository.findById(id);
        if (users.isEmpty()) {
            throw new Exception(" Student not found");
        }
        return users.orElse(null);
    }

    public Users save(Users users) {
        return usersRepository.save(users);
    }
    public void delete(Long users) {
        usersRepository.deleteById(users);
    }
}
