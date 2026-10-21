package com.christian.holaMundo.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/")
    public String menu(Model model) {
        model.addAttribute("menu", "menu");
        return "menu";
    }

    @GetMapping("/Index")
    public String saluda(Model model) {
        model.addAttribute("Index", "Hola Gente");
        return "Index";
    }

    @GetMapping("/despedida")
    public String despedida(Model model) {
        model.addAttribute("despedida", "Adios gente");
        return "despedida";
    }


    @GetMapping("/felicita/{id}")
    public String felicita(@PathVariable("id") String id,
                           @RequestParam(value = "name",required = false,defaultValue = "name")String name,
                           @RequestParam(value = "edad",required = false,defaultValue = "0") Integer edad,
                           Model model) {
        model.addAttribute("idUsuario", id);
        model.addAttribute("nombreUsuario", name);
        model.addAttribute("edadUsuario", edad);

        return "felicita";
    }
}