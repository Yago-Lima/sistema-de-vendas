package com.empresa.repository;

import com.empresa.model.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PessoaRepository {
    @PersistenceContext
    private EntityManager em;

    public void save(Pessoa pessoa) {
        em.persist(pessoa);
    }
    public Pessoa pessoa(Long id) {
        return em.find(Pessoa.class,id);
    }

    public List<Pessoa> pessoaList() {
        Query query = em.createQuery("from Pessoa ");
        return query.getResultList();
    }

    public void remove(Long id) {
        Pessoa pessoa = em.find(Pessoa.class, id);
        em.remove(pessoa);
    }

    public void update(Pessoa pessoa) {
        em.merge(pessoa);
    }
}
