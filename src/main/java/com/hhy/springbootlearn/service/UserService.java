package com.hhy.springbootlearn.service;

import com.hhy.springbootlearn.entity.SysUser;

/**
 * Created by hhy on 17/7/11.
 */
public interface UserService {
    public SysUser findByUserName(String userName);
}
