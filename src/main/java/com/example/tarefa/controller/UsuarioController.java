package com.example.tarefa.controller;

import com.example.tarefa.models.entity.User;
import com.example.tarefa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsuarioController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/cadastrarUser")
    public ModelAndView cadastrar(User user){
        ModelAndView mv = new ModelAndView("administrativo/user/cadastrarUser");
        mv.addObject("user", user);
        return mv;
    }

    @PostMapping("/salvarUser")
    public ModelAndView salvar(User user, BindingResult result){
        if (result.hasErrors()){
            return cadastrar(user);
        }
        repository.saveAndFlush(user);
        return cadastrar(new User());
    }

}
