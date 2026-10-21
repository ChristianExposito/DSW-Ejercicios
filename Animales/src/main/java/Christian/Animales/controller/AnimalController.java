package Christian.Animales.controller;

import Christian.Animales.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnimalController {
    //Forma1 de inyectar dependencias en spring
    @Autowired
    AnimalService as1;

    //Forma 2 de inyectar dependencias en spring)

    /*AnimalService service;
    public AnimalController(AnimalService service){
        this.service = service;
    }*/

    @GetMapping("/index")
        public String listarAnimales(Model model){
            model.addAttribute("animales", as1.findAll());
            return "index";
        }
}
