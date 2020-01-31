/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.doce.Repositories;

import br.com.doce.Model.Vendas;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author eupen
 */
public interface VendaRepository extends CrudRepository<Vendas, Long>{
    
}
