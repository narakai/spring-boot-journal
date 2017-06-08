package com.clem.www.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;

@Configuration
@EnableGlobalAuthentication
public class InMemorySecurityConfiguration {

        //test
       @Autowired
       public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
               auth.inMemoryAuthentication().withUser("user").password("root").roles("USER")
                               .and().withUser("admin").password("root").roles("USER", "ADMIN");
       }
}