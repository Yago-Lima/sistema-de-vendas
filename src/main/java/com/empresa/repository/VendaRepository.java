package com.empresa.repository;

import com.empresa.model.ItemVenda;
import com.empresa.model.Venda;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VendaRepository {
    @PersistenceContext
    private EntityManager em;

    public List<Venda> vendaList() {
        Query query = em.createQuery("from Venda ");
        return query.getResultList();
    }


    public List<ItemVenda> findByVendaId(Long vendaId) {
        Query query = em.createQuery("SELECT item FROM ItemVenda item WHERE item.venda.id = :vendaId");
        query.setParameter("vendaId", vendaId);
        return query.getResultList();
    }
}
