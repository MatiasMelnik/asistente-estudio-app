package com.estudioasistente.dao;

import jakarta.persistence.*;

public class GenericDAO<T> {

    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("asistentePU");

    public void guardar(T entidad) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
        em.close();
    }
}
