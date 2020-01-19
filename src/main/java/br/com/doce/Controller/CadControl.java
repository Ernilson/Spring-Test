/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.doce.Controller;

import br.com.doce.Model.CadModel;
import br.com.doce.ServiceImpl.CadServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Convidado
 */
@Controller
@RequestMapping
public class CadControl {

    @Autowired
    private CadServiceImpl service;

   @GetMapping({"/","/home","/index"})
    public String inicio() {
        return "index";
    }

    //Metodo para incluir novo cadastro
    @RequestMapping(method = RequestMethod.GET, value = "/novo")
    public ModelAndView novoCadastro() {
        ModelAndView v = new ModelAndView("add.html");
        v.addObject(new CadModel());
        v.setViewName("add");
        return v;
    }
    
    //Metodo para incluir venda
    @RequestMapping(method = RequestMethod.GET, value = "/venda")
    public ModelAndView venda() {
        ModelAndView v = new ModelAndView("vendas.html");
        v.addObject(new CadModel());
        v.setViewName("vendas");
        return v;
    }

    //Metodo para salvar cadastro
    @RequestMapping(method = RequestMethod.POST, value = "/salvar")
    public String salvar(CadModel c) {
        service.saveOrUpdate(c);
        return "redirect:/listar";
    }

    //Metodo para listar todos os cadastros
    @RequestMapping(method = RequestMethod.GET, value = "/listar")
    public ModelAndView listar() {
        ModelAndView v = new ModelAndView("listar");
        List<CadModel> cadastro = service.listAll();
        v.addObject("cadastro", cadastro);
        return v;
    }

    //Metodo para alterar cadastro  
    @GetMapping("/edite/{id}")
    public String editar(@PathVariable long id, Model m) {
        CadModel cad = service.getId(id);
        m.addAttribute("cad", cad);
        return "editar";
    }

    //Metodo para salvar cadastro 
    @RequestMapping(value = "/editsave", method = RequestMethod.POST)
    public ModelAndView editsave(@ModelAttribute("cad") CadModel emp) {
        boolean idd = Boolean.getBoolean("id");
        idd = service.alterar(emp);
        return new ModelAndView("redirect:/listar");
    }

    //Metodo para excluir dados do cadastro
    @GetMapping("/deletar/{id}")
    public String remover(@PathVariable long id) {
        service.delete(id);
        return "redirect:/listar";
    }
}
