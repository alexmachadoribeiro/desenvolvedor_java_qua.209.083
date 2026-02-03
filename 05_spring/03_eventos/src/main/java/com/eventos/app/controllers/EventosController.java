package com.eventos.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventosController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
