package com.ivoronline.springboot_security_loginform_custom.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {

    //CUSTOM LOGIN FORM
    httpSecurity.formLogin()
      .loginPage("/MyLogin")         //Custom  HTML Page for entering   Credentials
      .loginProcessingUrl("/login"); //Default HTML Page for processing Credentials

    //DISABLE CSRF
    httpSecurity.csrf().disable();

  }

}

