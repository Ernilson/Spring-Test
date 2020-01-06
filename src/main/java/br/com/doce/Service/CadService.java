/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.doce.Service;

import br.com.doce.Model.CadModel;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author eupen
 */
public interface CadService {

    List<CadModel> listAll();

    boolean alterar(CadModel dto);

    CadModel getId(Long id);

    CadModel saveOrUpdate(CadModel cm);

    void delete(Long id);

}
