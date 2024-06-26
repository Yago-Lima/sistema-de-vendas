package com.empresa.repository;

import com.empresa.model.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ProdutoRepository {
    @PersistenceContext
    private EntityManager em;

    public void save(Produto produto) {
        em.persist(produto);
    }
    public Produto produto(Long id) {
        return em.find(Produto.class,id);
    }

    public List<Produto> produtoList() {
        Query query = em.createQuery("from Produto ");
        return query.getResultList();
    }

    public void remove(Long id) {
        Produto produto = em.find(Produto.class, id);
        em.remove(produto);
    }

    public void update(Produto produto) {
        em.merge(produto);
    }
}
