package br.com.doce;

import br.com.doce.Model.Produto;
import br.com.doce.ServiceImpl.ProdServiceImpl;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private ProdServiceImpl pservice;

    @Test
    void contextLoads() {
       Produto p = new Produto();
      p.setNome("teste4");
      p.setPreco(new BigDecimal("10.21"));
       
      
       pservice.saveOrUpdate(p);
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
