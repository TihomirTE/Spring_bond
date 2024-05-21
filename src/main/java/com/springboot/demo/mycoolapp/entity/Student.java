package com.springboot.demo.mycoolapp.entity;

import jakarta.persistence.*;

// This is the POJO class
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstNAme;

    @Column(name = "last_name")
    private String lastNAme;

    @Column(name = "email")
    private String email;

    public Student(String firstNAme, String lastNAme, String email) {
        this.firstNAme = firstNAme;
        this.lastNAme = lastNAme;
        this.email = email;
    }

    public Student(){

    }

    public int getId() {
        return id;
    }

    public String getFirstNAme() {
        return firstNAme;
    }

    public String getLastNAme() {
        return lastNAme;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstNAme(String firstNAme) {
        this.firstNAme = firstNAme;
    }

    public void setLastNAme(String lastNAme) {
        this.lastNAme = lastNAme;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstNAme='" + firstNAme + '\'' +
                ", lastNAme='" + lastNAme + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
