/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.doce.Service;

import br.com.doce.ServiceRole.Role;
import java.util.List;

/**
 *
 * @author Convidado
 */
public interface RoleService {
    
    List<Role> listAll();

    boolean alterar(Role dto);

    Role getId(Long id);

    Role saveOrUpdate(Role cm);

    void delete(Long id);
    
}
