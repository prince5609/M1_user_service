package com.user.service;

import com.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userdao;

    @Override
    public User getUser(Long id){
        List<User> list = userdao.findAll();
        // To get single user having same id -->
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().
                orElse(null);
    }

    @Override
    public User addUser(User user){
        userdao.save(user);
        return user;
    }

    @Override
    public List<User> getList() {
        return userdao.findAll();
    }

    @Override
    public User updateUser(User user){
        userdao.save(user);
        return user;
    }

    @Override
    public String deleteUser(Long id){
        User user = userdao.getReferenceById(id);
        userdao.delete(user);
        return "Deleted successfully";
    }
}
