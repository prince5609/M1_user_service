package com.user.service;
import com.user.entity.User;

import java.util.List;

public interface UserService {

    public User getUser(Long id);

    public User addUser(User user);

    public List<User> getList();

    public User updateUser(User user);

    public String deleteUser(Long id);
}
