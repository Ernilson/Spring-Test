/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.doce.ServiceImpl;

import br.com.doce.Model.CadModel;
import br.com.doce.Repositories.CadRepository;
import br.com.doce.Service.CadService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author eupen
 */
@Service
public class CadServiceImpl implements CadService {
    
    private CadRepository cdao;

    @Autowired
    public CadServiceImpl(CadRepository cdao) {
        this.cdao = cdao;
    }

    public CadServiceImpl() {
    }
     
    @Override
    public List<CadModel> listAll() {
        List<CadModel> cm = new ArrayList<>();
        cdao.findAll().forEach(cm::add); //fun with Java 8
        return cm;
    }
   

    @Override
    public CadModel saveOrUpdate(CadModel cm) {
         cdao.save(cm);
        return cm;
    }

    @Override
    public void delete(Long id) {
        cdao.deleteById(id);
    }  

    @Override
    public CadModel getId(Long id) {
        return cdao.findById(id).get();
    }   

    @Override
    public boolean alterar(CadModel dto) {
        try {
            cdao.save(dto);
            return true;
        } catch (Exception e) {
            return false;
        }       
 
    }
   
}
