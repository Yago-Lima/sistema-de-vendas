package com.empresa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "produto")
public class Produto {
    @GeneratedValue(strategy = GenerationType.IDENTITY) //define como auto incremento
    @Id
    private Integer id;
    private String descricao;
    private double valor;

    public Produto() {
    }

    public Produto(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public Produto(Integer id, String descricao, double valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
