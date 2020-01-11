/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.doce.ServiceRole;

import br.com.doce.Repositories.CadRepository;
import br.com.doce.ServiceImpl.RoleServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 *
 * @author Convidado
 */
@Component
public class DataInicio implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private RoleServiceImpl impl;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        List<Role> role = impl.listAll();
        if (!role.isEmpty()) {
           
        }else{
             Role user = new Role();

            user.setName("admin");
            user.setSenha("admin");

            impl.saveOrUpdate(user);
        }
    }
}
