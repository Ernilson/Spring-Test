package br.com.doce;

import br.com.doce.Model.CadModel;
import br.com.doce.ServiceImpl.CadServiceImpl;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    private CadServiceImpl service;

    @Autowired
    public ApplicationTests(CadServiceImpl service) {
        this.service = service;
    }

    @Test
    void contextLoads() {
        CadModel cm = new CadModel();
        
        cm.setId(2L);
        cm.setNome("Sibre");
        cm.setEnder("Hoje");
        cm.setFone("1234567");
        cm.setEmail("@Sibre");
        
        service.alterar(cm);
    }

    // -----------------------LISTAR-TODOS--------------------------
    
//    @Test
//    public void listar(){
//        List<CadModel> cad = service.listAll();
//        System.out.println("Total de Registra" + cad.size());
//        for (CadModel cadastroModel : cad) {
//            System.out.println(cadastroModel.getNome()+"-"+cadastroModel.getEnder()
//            +"-"+ cadastroModel.getFone()+"-"+ cadastroModel.getEmail());
//            
//        }        
//    }
    
    // -----------------------BUSCA POR ID--------------------------
    
//    @Test
//    public void buscaPorId(){        
//        CadModel cm = service.getId(3L);
//        System.out.println(cm.getNome()+"-"+ cm.getEnder()
//                +"-"+ cm.getFone()+ "-"+ cm.getEmail());       
//        
//    }
}
