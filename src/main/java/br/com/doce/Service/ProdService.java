/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.doce.Service;

import br.com.doce.Model.Produto;
import java.util.List;

/**
 *
 * @author eupen
 */
public interface ProdService {
    
     List<Produto> listAll();

    boolean alterar(Produto dto);

    Produto getId(Long id);

    Produto saveOrUpdate(Produto cm);

    void delete(Long id);
}
