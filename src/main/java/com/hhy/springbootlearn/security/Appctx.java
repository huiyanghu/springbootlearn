package com.hhy.springbootlearn.security;

/**
 * Created by hhy on 17/7/12.
 */

import org.springframework.context.ApplicationContext;

public class Appctx {
    public static ApplicationContext ctx=null;
    public static Object getObject(String string){
        return ctx.getBean(string);
    }
}

