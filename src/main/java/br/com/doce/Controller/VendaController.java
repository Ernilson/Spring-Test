/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.doce.Controller;

import br.com.doce.Model.CadModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author eupen
 */
@Controller
@RequestMapping
public class VendaController {
    
//    @GetMapping({"/","/home","/index"})
//    public String inicio() {
//        return "index";
//    }
//    
//    //Metodo para incluir venda
//    @RequestMapping(method = RequestMethod.GET, value = "/venda")
//    public ModelAndView venda() {
//        ModelAndView v = new ModelAndView("vendas.html");
//        v.addObject(new CadModel());
//        v.setViewName("vendas");
//        return v;
//    }
}
