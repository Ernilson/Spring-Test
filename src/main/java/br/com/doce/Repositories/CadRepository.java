/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.doce.Repositories;

import br.com.doce.Model.CadModel;
import br.com.doce.ServiceRole.Role;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eupen
 */
@Repository
public interface CadRepository extends CrudRepository<CadModel, Long>{

    void save(long id);

     void save(Role user);
     
        
 }
