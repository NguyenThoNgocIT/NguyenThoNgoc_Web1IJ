package com.example.Lab6NTN.models;

import jakarta.persistence.*;

@Entity ///để đánh dấu cái class này là một cái table
@Table(name = "students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) /// đây là cái chuỗi được tăng lên ngẫu nhiên 
    private int id;
    private String name;
    private int age;
    private String email;

    public Students() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
