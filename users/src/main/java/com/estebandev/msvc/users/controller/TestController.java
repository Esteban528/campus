package com.estebandev.msvc.users.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;

/**
 * Test
 */
@RestController
@RequestMapping("/users/test")
public class TestController {

  Logger logger = LoggerFactory.getLogger(TestController.class);

  @GetMapping("/ping")
  public String getMethodName() {
    logger.info("Ping pong");
    return "pong";
  }

}
