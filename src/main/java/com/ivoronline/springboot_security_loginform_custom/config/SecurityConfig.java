package com.ivoronline.springboot_security_loginform_custom.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {

    //SPECIFY ACCESS TO ENDPOINTS
    httpSecurity.authorizeRequests()
      .antMatchers("/hello").hasRole("USER")
      .antMatchers("/MyLogin").permitAll();                   //No log in (anonymous access)

    //REDIRECT TO LOGIN FORM
    httpSecurity.formLogin();

  }

}
