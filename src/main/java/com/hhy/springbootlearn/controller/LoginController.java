package com.hhy.springbootlearn.controller;

import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hhy on 17/7/11.
 */
@RestController
public class LoginController {

    /*@RequestMapping(value = "/login")
    //用户名密码是用base64 加密 原文为 admin:admin 即 用户名:密码  内容是放在request.getHeader 的 "authorization" 中
    public Object login(@AuthenticationPrincipal SysUser loginedUser, @RequestParam(name = "logout", required = false) String logout) {
        if (logout != null) {
            return null;
        }
        if (loginedUser != null) {
            return loginedUser;
        }
        return null;
    }*/
}
