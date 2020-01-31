/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.doce.ServiceImpl;

import br.com.doce.Model.CadModel;
import br.com.doce.Model.Vendas;
import br.com.doce.Repositories.VendaRepository;
import br.com.doce.Service.VendaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author eupen
 */
@Service
public class VendaServiceImpl implements VendaService{
   
    private VendaRepository vr;

    @Autowired
    public VendaServiceImpl(VendaRepository vr) {
        this.vr = vr;
    }    
    
    @Override
    public List<Vendas> listAll() {
        List<Vendas> cm = new ArrayList<>();
        vr.findAll().forEach(cm::add); //fun with Java 8
        return cm;
    }

    @Override
    public boolean alterar(Vendas dto) {
        try {
            vr.save(dto);
            return true;
        } catch (Exception e) {
            return false;
        } 
    }

    @Override
    public Vendas getId(Long id) {
        return vr.findById(id).get();
    }
    
    @Override
    public Vendas saveOrUpdate(Vendas cm) {
         vr.save(cm);
        return cm;
    }

    @Override
    public void delete(Long id) {
         vr.deleteById(id);
    }
    
}
