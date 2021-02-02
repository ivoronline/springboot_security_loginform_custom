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

    //CUSTOM LOGIN FORM
    httpSecurity.formLogin()
      .loginPage("/MyLogin")
      .loginProcessingUrl("/login");

    //DISABLE CSRF
    httpSecurity.csrf().disable();

    //SPECIFY ACCESS TO ENDPOINTS
    httpSecurity.authorizeRequests()
      .antMatchers("/Hello").hasRole("USER");

  }

}

