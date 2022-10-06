package com.user.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="User")  // By default, hibernate can take this
public class User {
    @Id
    private Long userId;
    private String name;
    private String phone;

    @OneToMany
    List<Contact> contacts;

    public User(Long userId, String name, String phone, List<Contact> contacts){
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts;
    }

    User(Long userId, String name, String phone){
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    User(){
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}