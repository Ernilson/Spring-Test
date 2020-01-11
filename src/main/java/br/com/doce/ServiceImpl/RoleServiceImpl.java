/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.doce.ServiceImpl;

import br.com.doce.Repositories.CadRepository;
import br.com.doce.Service.RoleService;
import br.com.doce.ServiceRole.Role;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Convidado
 */
@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private CadRepository cr;
    
    @Override
    public List<Role> listAll() {
          List<Role> cm = new ArrayList<>();
        cr.findAll(); //fun with Java 8
        return cm;
    }
    @Override
    public boolean alterar(Role dto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Role getId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Role saveOrUpdate(Role cm) {
        cr.save(cm);
        return cm;
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
