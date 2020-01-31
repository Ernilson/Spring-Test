/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.doce.Model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;
/**
 *
 * @author eupen
 */
@Entity
@Table(name = "cadastro")
public class CadModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String ender;
    private String fone;
    private String email;
   

    public CadModel() {
    }

    public CadModel(Long id, String nome, String ender, String fone, String email) {
        this.id = id;
        this.nome = nome;
        this.ender = ender;
        this.fone = fone;
        this.email = email;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ender
     */
    public String getEnder() {
        return ender;
    }

    /**
     * @param ender the ender to set
     */
    public void setEnder(String ender) {
        this.ender = ender;
    }

    /**
     * @return the fone
     */
    public String getFone() {
        return fone;
    }

    /**
     * @param fone the fone to set
     */
    public void setFone(String fone) {
        this.fone = fone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CadModel other = (CadModel) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
