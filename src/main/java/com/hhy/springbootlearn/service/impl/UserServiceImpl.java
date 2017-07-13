package com.hhy.springbootlearn.service.impl;


import com.hhy.springbootlearn.entity.SysUser;
import com.hhy.springbootlearn.repository.UserRepository;
import com.hhy.springbootlearn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hhy on 17/7/11.
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public SysUser findByUserName(String userName) {
         return userRepository.findByUserName(userName);
    }
}
