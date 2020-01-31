/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.doce.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author eupen
 */
@Entity
@Table(name = "venda")
public class Vendas implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_v;
    private int codvenda;
    private String nome;
    private String descricao;
    private int qtdp;
    private BigDecimal valorItem;
    private BigDecimal SubTotal;
    private BigDecimal valorTotal;
    private String formaPg;
    private CadModel cadastro;

    public Vendas() {
    }

    public Vendas(int id_v, int codvenda, String nome, String descricao, int qtdp, BigDecimal valorItem, BigDecimal SubTotal, BigDecimal valorTotal, String formaPg, CadModel cadastro) {
        this.id_v = id_v;
        this.codvenda = codvenda;
        this.nome = nome;
        this.descricao = descricao;
        this.qtdp = qtdp;
        this.valorItem = valorItem;
        this.SubTotal = SubTotal;
        this.valorTotal = valorTotal;
        this.formaPg = formaPg;
        this.cadastro = cadastro;
    }

    /**
     * @return the id_v
     */
    public int getId_v() {
        return id_v;
    }

    /**
     * @param id_v the id_v to set
     */
    public void setId_v(int id_v) {
        this.id_v = id_v;
    }

    /**
     * @return the codvenda
     */
    public int getCodvenda() {
        return codvenda;
    }

    /**
     * @param codvenda the codvenda to set
     */
    public void setCodvenda(int codvenda) {
        this.codvenda = codvenda;
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
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the qtdp
     */
    public int getQtdp() {
        return qtdp;
    }

    /**
     * @param qtdp the qtdp to set
     */
    public void setQtdp(int qtdp) {
        this.qtdp = qtdp;
    }

    /**
     * @return the valorItem
     */
    public BigDecimal getValorItem() {
        return valorItem;
    }

    /**
     * @param valorItem the valorItem to set
     */
    public void setValorItem(BigDecimal valorItem) {
        this.valorItem = valorItem;
    }

    /**
     * @return the SubTotal
     */
    public BigDecimal getSubTotal() {
        return SubTotal;
    }

    /**
     * @param SubTotal the SubTotal to set
     */
    public void setSubTotal(BigDecimal SubTotal) {
        this.SubTotal = SubTotal;
    }

    /**
     * @return the valorTotal
     */
    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the formaPg
     */
    public String getFormaPg() {
        return formaPg;
    }

    /**
     * @param formaPg the formaPg to set
     */
    public void setFormaPg(String formaPg) {
        this.formaPg = formaPg;
    }

    /**
     * @return the cadastro
     */
    public CadModel getCadastro() {
        return cadastro;
    }

    /**
     * @param cadastro the cadastro to set
     */
    public void setCadastro(CadModel cadastro) {
        this.cadastro = cadastro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id_v;
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
        final Vendas other = (Vendas) obj;
        if (this.id_v != other.id_v) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vendas{" + "id_v=" + id_v + ", codvenda=" + codvenda + ", nome=" + nome + ", descricao=" + descricao + ", qtdp=" + qtdp + ", valorItem=" + valorItem + ", SubTotal=" + SubTotal + ", valorTotal=" + valorTotal + ", formaPg=" + formaPg + ", cadastro=" + cadastro + '}';
    }
    
    
}
