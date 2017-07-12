package com.hhy.springbootlearn.service.impl;

import com.hhy.springbootlearn.domain.User;
import com.hhy.springbootlearn.repository.UserRepository;
import com.hhy.springbootlearn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by hhy on 17/7/11.
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User login(String userName, String password) {
        List<User> userList = userRepository.getByUserName(userName);
        if (userList != null && !userList.isEmpty()) {
            User user = userList.get(0);
            if (password.equals(user.getPassword())) {
                return user;
            }
            return null;
        }
        return null;
    }
}
