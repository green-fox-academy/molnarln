package com.greenfox.error.service;

import com.greenfox.error.model.User;
import com.greenfox.error.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by aze on 25/10/17.
 */

@Service
public class UserService {

    private ArrayList<User> users;
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.users = new ArrayList<>();
        this.userRepository = userRepository;
    }

    public ArrayList<User> getAll() {
        return users;
    }

    public void save(User user) {
        users.add(user);
    }

}
