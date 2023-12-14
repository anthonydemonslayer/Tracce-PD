/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package UEFA;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Antonio
 */
@Stateless
@LocalBean
@WebService

public class PartitaEJB implements PartitaEJBRemote {

    @Inject
    private EntityManager em;
    
    @Override
    public void aggiungiPartita(Partita p) {
        em.persist(p);
    }
    @Override
    public Partita aggiornaPartita(Partita p) {
        return em.merge(p);
        
    }

    @Override
    public void rimuoviPartita(Partita p) {
        em.remove(em.merge(p));
    }

    @Override
    public Partita trovaPerId(int id) {
        TypedQuery<Partita> query = em.createNamedQuery(Partita.TROVA_PER_ID, Partita.class);
        query.setParameter(1, id);
        return query.getSingleResult();
        
    }

    @Override
    public List<Partita> trovaPerTipoPartita(String tipo_partita) {
        TypedQuery<Partita> query = em.createNamedQuery(Partita.TROVA_PER_TIPO_PARTITA, Partita.class);
        query.setParameter("tipo_partita", tipo_partita);
        return query.getResultList();
    }

    @Override
    public List<Partita> trovaPerNumeroAmmonizioni(int numero_ammonizioni) {
        TypedQuery<Partita> query = em.createNamedQuery(Partita.TROVA_PER_NUMERO_AMMONIZIONI, Partita.class);
        query.setParameter("numero_ammonizioni", numero_ammonizioni);
        return query.getResultList();
    }

    @Override
    public List<Partita> trovaPerNumeroEspulsioni(int numero_espulsioni) {
        TypedQuery<Partita> query = em.createNamedQuery(Partita.TROVA_PER_NUMERO_ESPULSIONI, Partita.class);
        query.setParameter("numero_espulsioni", numero_espulsioni);
        return query.getResultList();
    }

    @Override
    public List<Partita> trovaPerNumeroGoal(int numero_goal) {
        TypedQuery<Partita> query = em.createNamedQuery(Partita.TROVA_PER_NUMERO_GOAL, Partita.class);
        query.setParameter("numero_goal", numero_goal);
        return query.getResultList();
    }

    @Override
    public List<Partita> trovaTutte() {
        TypedQuery<Partita> query = em.createNamedQuery(Partita.TROVA_TUTTE, Partita.class);
        return query.getResultList();
    }
}
