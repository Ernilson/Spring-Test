/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.doce.ServiceImpl;

import br.com.doce.Model.Produto;
import br.com.doce.Repositories.ProdutoRepository;
import br.com.doce.Service.ProdService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author eupen
 */
@Service
public class ProdServiceImpl implements ProdService{
    
    private ProdutoRepository pr;

    @Autowired
    public ProdServiceImpl(ProdutoRepository pr) {
        this.pr = pr;
    }    
    
    @Override
    public List<Produto> listAll() {
        List<Produto> cm = new ArrayList<>();
        pr.findAll().forEach(cm::add); //fun with Java 8
        return cm;
    }

    @Override
    public boolean alterar(Produto dto) {
        try {
            pr.save(dto);
            return true;
        } catch (Exception e) {
            return false;
        } 
    }

    @Override
    public Produto getId(Long id) {
       return pr.findById(id).get();
    }

    @Override
    public Produto saveOrUpdate(Produto cm) {
        pr.save(cm);
        return cm;
    }

    @Override
    public void delete(Long id) {
         pr.deleteById(id);
    }
    
}
