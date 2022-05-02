package com.ivoronline.springboot_security_loginform_custom.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  //===============================================================================
  // CONFIGURE
  //===============================================================================
  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {

    //CUSTOM LOGIN FORM
    httpSecurity.formLogin()
      .loginPage("/CustomLoginEndpoint") //Custom           Endpoint for entering   Credentials
      .loginProcessingUrl("/login");     //Include Built-in Endpoint for processing Credentials

    //DISABLE CSRF
    httpSecurity.csrf().disable();

  }

}

