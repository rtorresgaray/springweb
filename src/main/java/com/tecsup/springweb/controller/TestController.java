package com.tecsup.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.tecsup.springweb.model.Programa;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
@RequestMapping(value = {"/","pruebas", "test"})
public class TestController {

    @ModelAttribute
    public void listado(Model model){
        model.addAttribute("nombres",new String[]{"Willian", "Rene"});
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("titulo", "Hola TECSUP");
        model.addAttribute("contenido","Bienvenidos al curso Spring Framework");
        
        Programa programa=new Programa();
        programa.setDescripcion("Programa de formación Regular");
        model.addAttribute("programa",programa);
        
        
        return "test/index";
        
    }
    
   // @RequestMapping("parametros")
   // public String parametros(String nombres,String apellido, Model model){
   //     model.addAttribute("nombres", nombres+ " " + apellido);
   //     return "test/informacion";
   // }
    
   @RequestMapping("parametros")
    public String parametros(String nombres,String apellido, Model model){
        model.addAttribute("nombres", nombres+ " " + apellido);
        return "test/informacion";
    }
    
    

    @RequestMapping(value = {"info", "prueba"})
    public String pruebas() {
        return "test/pruebas";
    }

    @RequestMapping("informacion")
    public String alternativo() {
        return "test/informacion";
    }
    
}
