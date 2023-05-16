package com.example.demoo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vitaly Chekushkin
 */

@RestController
public class SimpleController {
  @GetMapping("/hello")
  public String hello() {
    return "hello";
  }
}
