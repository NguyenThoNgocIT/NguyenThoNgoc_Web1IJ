package com.example.Lab6NTN.controller;

import com.example.Lab6NTN.models.Students;
import com.example.Lab6NTN.models.Users;
import com.example.Lab6NTN.service.StudentService;
import com.example.Lab6NTN.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;
    //khởi tạo danh sách
    public UsersController(){

    }
    @GetMapping("/")
    public List<Users> getUsersList() {
        List<Users> list = usersService.ShowList();
        return list;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Users> getUsersById(@PathVariable("id") Long usersId) throws Exception {
        Users users = usersService.findById(usersId);
        return ResponseEntity.ok(users);
    }
    @DeleteMapping("/{id}")
    @ResponseBody
    public ResponseEntity<List<Users>> removeUsersById(@PathVariable("id") Long usersId) throws Exception {
        Users users= usersService.findById(usersId);
        if (users != null) {
            usersService.delete(usersId);
        }
        return ResponseEntity.status(404).body(usersService.ShowList());
    }

}

