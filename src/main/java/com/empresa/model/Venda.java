package com.empresa.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TB_VENDA")
public class Venda implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Pessoa cliente;
    @DateTimeFormat(pattern="dd/MM/yyyy HH:mm:ss")
    private Date data;


    public Date getData() {
        return data;
    }
    @OneToMany(mappedBy = "venda")
    private List<ItemVenda> itemVendaList;

    public double total() {
        double total = 0.0;
        for (ItemVenda itemVenda :itemVendaList){
            total += itemVenda.total().doubleValue();
        }
        return total;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public List<ItemVenda> getItemVendaList() {
        return itemVendaList;
    }

    public void setItemVendaList(List<ItemVenda> itemVendaList) {
        this.itemVendaList = itemVendaList;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
