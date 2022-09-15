package br.ufrpe.rubank.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegistrarController {
  
  @RequestMapping(value = "/registrar", method = RequestMethod.GET)
  @ResponseBody
  public String client() {
    return "client";
  }

}