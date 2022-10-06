package com.user.controller;

import com.user.entity.Contact;
import com.user.entity.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private UserService userService;
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/user/add")
    public User add_user(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/user/all")
    public List<User> get_user(){
        return userService.getList();
    }

    @GetMapping("/user/{id}")
    public User get_user_by_id(@PathVariable Long id){
        User user = this.userService.getUser(id);
        List<Contact> contacts = this.restTemplate.getForObject
//                ("http://localhost:9002/contact/"+ id, List.class);
        ("http://contact-service/contact/"+ id, List.class);

        user.setContacts(contacts);
        return user;
    }

    @PutMapping("/user/update")
    public User update_user(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/user/delete/{id}")
    public String delete_user(@PathVariable Long id){
        return userService.deleteUser(id);
    }
}
