/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UEFA;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.enterprise.inject.Produces;

/**
 *
 * @author Antonio
 */
public class DatabaseProducer {
    @Produces
    @PersistenceContext(unitName = "UEFAPU")
    private EntityManager em;
    
    
}
