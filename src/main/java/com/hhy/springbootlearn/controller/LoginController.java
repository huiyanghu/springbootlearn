package com.hhy.springbootlearn.controller;

import com.hhy.springbootlearn.domain.User;
import com.hhy.springbootlearn.repository.UserRepository;
import com.hhy.springbootlearn.service.UserService;
import com.hhy.springbootlearn.util.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by hhy on 17/7/11.
 */
@RestController
public class LoginController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;


    @RequestMapping("/login")
    public Object login(@RequestParam(required = true) String userName, @RequestParam(required = true) String password, HttpSession session) {
        User user = userService.login(userName, password);
        ResultBean resultBean = new ResultBean();
        if (user == null) {
            resultBean.setMsg("登录失败");
            resultBean.setCode(666);
        } else {
            session.setAttribute("loginUser", user);
            resultBean.setMsg("登录成功");
            resultBean.setCode(1);
        }
        return resultBean;
    }
}
