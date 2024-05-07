package com.danrley.regiscweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

  @GetMapping("hello")
  public String hello(HttpServletRequest request) {
    request.setAttribute("name", "Danrley");
    return "hello";
  }

  @GetMapping("hello1")
  public String hello(Model request) {
    request.addAttribute("name", "Danrley");
    return "hello";
  }

  @GetMapping("hello2")
  public ModelAndView hello() {
    ModelAndView mv = new ModelAndView("hello");
    mv.addObject("name", "Danrley");
    return mv;
  }

}
