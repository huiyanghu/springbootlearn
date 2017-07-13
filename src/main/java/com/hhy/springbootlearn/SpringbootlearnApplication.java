package com.hhy.springbootlearn;

import com.hhy.springbootlearn.config.GlobalConstants;
import com.hhy.springbootlearn.security.Appctx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;

import java.util.Date;

@SpringBootApplication
public class SpringbootlearnApplication {

    public static void main(String[] args) {

        //SpringApplication.run(SpringbootlearnApplication.class, args);


        SpringApplication app = new SpringApplication(SpringbootlearnApplication.class);

        Appctx.ctx = app.run(args);
        /*UserService suserService = (UserService) Appctx.ctx.getBean("suserService");
        SysUser su= suserService.findByName("TEST");
        BCryptPasswordEncoder bc=new BCryptPasswordEncoder(4);//将密码加密 可以先设置初始密码：000000
        su.setPassword(bc.encode(su.getPassword()));//然后使用密码为key值进行加密，运行主类后，会自动加密密码，可连接数据库查看。
        System.out.println("密码"+su.getPassword());
        suserService.update(su);//运行一次后记得注释这段重复加密会无法匹配*/
    }





    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {
        System.out.println("----------EmbeddedServletContainerCustomizer containerCustomizer-----------");
        //使用Java 7内部类的一个等价实现方式
        return new EmbeddedServletContainerCustomizer() {
            @Override
            public void customize(ConfigurableEmbeddedServletContainer container) {
                ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/401.html");
                ErrorPage error403Page = new ErrorPage(HttpStatus.FORBIDDEN, "/page/403.html");
                ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
                ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");
                container.addErrorPages(error401Page, error404Page, error500Page);
            }
        };
    }
}
