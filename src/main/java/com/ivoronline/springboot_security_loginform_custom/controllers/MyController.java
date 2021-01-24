package com.ivoronline.springboot_security_loginform_custom.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @RequestMapping("/hello")
  public String sayHello() {
    return "Message from Controller";
  }

  @RequestMapping("/MyLogin")
  public String myLogin() {
    return "MyLoginForm";
  }


}
