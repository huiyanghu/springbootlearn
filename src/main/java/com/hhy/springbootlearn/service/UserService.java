package com.hhy.springbootlearn.service;

import com.hhy.springbootlearn.domain.User;

import java.util.Map;

/**
 * Created by hhy on 17/7/11.
 */
public interface UserService {
    public User login(String userName, String password);
}
