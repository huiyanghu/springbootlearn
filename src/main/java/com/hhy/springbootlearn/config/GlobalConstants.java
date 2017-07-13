package com.hhy.springbootlearn.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by hhy on 17/7/13.
 */

@Configuration
public class GlobalConstants {

    //private static final String VERSION = "global.constants.version";

    //@Autowired
    //protected Environment env;

    @Bean(name = "version")
    public String getVersion() {
        //String version = env.getRequiredProperty(VERSION);
        return ""+new Date().getTime();
        //return version;
    }

}
