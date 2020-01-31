/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.doce.Service;

import br.com.doce.Model.CadModel;
import br.com.doce.Model.Vendas;
import java.util.List;

/**
 *
 * @author eupen
 */
public interface VendaService {
    
     List<Vendas> listAll();

    boolean alterar(Vendas dto);

    Vendas getId(Long id);

    Vendas saveOrUpdate(Vendas cm);

    void delete(Long id);
}
