package com.ivoronline.springboot_security_loginform_custom.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  //===============================================================================
  // MY LOGIN
  //===============================================================================
  @RequestMapping("/MyLogin")
  public String myLogin() {
    return "MyLogin";
  }

  //===============================================================================
  // HELLO
  //===============================================================================
  @ResponseBody
  @Secured("ROLE_USER")
  @RequestMapping("/Hello")
  public String hello() {
    return "Hello from Controller";
  }

}
