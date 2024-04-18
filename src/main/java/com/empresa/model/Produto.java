package com.empresa.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY) //define como auto incremento
    @Id
    private Long id;
    private String descricao;
    private BigDecimal valor;

    @OneToMany(mappedBy = "produto")
    private List<ItemVenda> itemVenda;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
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

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
