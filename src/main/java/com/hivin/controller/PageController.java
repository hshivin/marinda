package com.hivin.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class PageController {
  Logger LOGGER = Logger.getLogger(PageController.class);


  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String index() {

    return "index";
  }


}
