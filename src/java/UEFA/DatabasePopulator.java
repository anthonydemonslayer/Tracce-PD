/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package UEFA;

import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.annotation.sql.DataSourceDefinition;
import javax.inject.Inject;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *
 * @author Antonio
 */
@Singleton
@Startup
@DataSourceDefinition(
    name = "java:global/jdbc/UEFADS",
    databaseName = "EsameDB",
    user = "Anthony", password = "DemonSlayer",
    className = "org.apache.derby.jdbc.EmbeddedDataSource",
    properties = {"connectionAttribute=;create=true"}
    )

public class DatabasePopulator {
    @Inject
    private PartitaEJB ejb;
    private Partita p1, p2, p3, p4;
    
    @PostConstruct
    private void populateDB() {
        p1 = new Partita(1, "Girone1", "Turchia", "Italia", 0, 3, 0, 0, "SI");
        p2 = new Partita(2, "Girone2", "Italia", "Svizzera", 3, 0, 1, 1, "SI");
        p3 = new Partita(3, "Ottavi", "Inghilterra", "Germania", 2, 0, 3, 1, "SI");
        p4 = new Partita(4, "Quarti", "Belgio", "Italia", 0, 0, 0, 0, "NO");
        

    ejb.aggiungiPartita(p1);
    ejb.aggiungiPartita(p2);
    ejb.aggiungiPartita(p3);
    ejb.aggiungiPartita(p4);
    }
    
    @PreDestroy
    private void clearDB() {
    ejb.rimuoviPartita(p1);
    ejb.rimuoviPartita(p2);
    ejb.rimuoviPartita(p3);
    ejb.rimuoviPartita(p4);
    
}
    
 }