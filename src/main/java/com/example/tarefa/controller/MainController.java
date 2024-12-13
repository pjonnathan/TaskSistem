package com.example.tarefa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/administrativo")
    public String home(){
        return ("administrativo/home");
    }
}
