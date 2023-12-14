/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UEFA;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;
import static UEFA.Partita.*;

/**
 *
 * @author Antonio
 */
@Entity
@NamedQueries({
    @NamedQuery(name = TROVA_PER_TIPO_PARTITA, query = "SELECT p FROM Partita p WHERE p.tipo_partita = :tipo_partita"),
    @NamedQuery(name = TROVA_PER_NUMERO_AMMONIZIONI, query = "SELECT p FROM Partita p WHERE p.numero_ammonizioni = :numero_ammonizioni"),
    @NamedQuery(name = TROVA_PER_NUMERO_ESPULSIONI, query = "SELECT p FROM Partita p WHERE p.numero_espulsioni = :numero_espulsioni"),
    @NamedQuery(name = TROVA_TUTTE, query = "SELECT p FROM Partita p"),
    @NamedQuery(name = TROVA_PER_NUMERO_GOAL, query = "SELECT p FROM Partita p WHERE (p.numero_goal_sc + p.numero_goal_so)> :numero_goal"),
    @NamedQuery(name = TROVA_PER_ID, query = "SELECT p FROM Partita p WHERE p.id = ?1")
})

@XmlRootElement

public class Partita implements Serializable {

    public static final String TROVA_PER_TIPO_PARTITA = "Partita.trovaPerTipoPartita";
    public static final String TROVA_PER_NUMERO_AMMONIZIONI = "Partita.trovaPerNumeroAmmonizioni";
    public static final String TROVA_PER_NUMERO_ESPULSIONI = "Partita.trovaPerNumeroEspulsioni";
    public static final String TROVA_PER_NUMERO_GOAL = "Partita.trovaPerNumeroGoal";
    public static final String TROVA_PER_ID = "Partita.trovaPerId";
    public static final String TROVA_TUTTE = "Partita.trovaTuttePartite";
    
    @Id
    private int id;
    private String tipo_partita;
    private String sc;
    private String so;
    private int numero_goal_sc;
    private int numero_goal_so;
    private int numero_ammonizioni;
    private int numero_espulsioni;
    private String partita_giocata;
    
    public Partita() {
        
    }

    public Partita(int id, String tipo_partita, String sc, String so, int numero_goal_sc, int numero_goal_so, int numero_ammonizioni, int numero_espulsioni, String partita_giocata) {
        this.id = id;
        this.tipo_partita = tipo_partita;
        this.sc = sc;
        this.so = so;
        this.numero_goal_sc = numero_goal_sc;
        this.numero_goal_so = numero_goal_so;
        this.numero_ammonizioni = numero_ammonizioni;
        this.numero_espulsioni = numero_espulsioni;
        this.partita_giocata = partita_giocata;
    }
    
    

    public int getId() {
        return id;
    }

    public String getTipo_partita() {
        return tipo_partita;
    }

    public String getSc() {
        return sc;
    }

    public String getSo() {
        return so;
    }

    public int getNumero_goal_sc() {
        return numero_goal_sc;
    }

    public int getNumero_goal_so() {
        return numero_goal_so;
    }

    public int getNumero_ammonizioni() {
        return numero_ammonizioni;
    }

    public int getNumero_espulsioni() {
        return numero_espulsioni;
    }

    public String getPartita_giocata() {
        return partita_giocata;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipo_partita(String tipo_partita) {
        this.tipo_partita = tipo_partita;
    }

    public void setSc(String sc) {
        this.sc = sc;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public void setNumero_goal_sc(int numero_goal_sc) {
        this.numero_goal_sc = numero_goal_sc;
    }

    public void setNumero_goal_so(int numero_goal_so) {
        this.numero_goal_so = numero_goal_so;
    }

    public void setNumero_ammonizioni(int numero_ammonizioni) {
        this.numero_ammonizioni = numero_ammonizioni;
    }

    public void setNumero_espulsioni(int numero_espulsioni) {
        this.numero_espulsioni = numero_espulsioni;
    }

    public void setPartita_giocata(String partita_giocata) {
        this.partita_giocata = partita_giocata;
    }

    @Override
    public String toString() {
        return "Partita{" + "id=" + id + ", tipo_partita=" + tipo_partita + ", sc=" + sc + ", so=" + so + ", numero_goal_sc=" + numero_goal_sc + ", numero_goal_so=" + numero_goal_so + ", numero_ammonizioni=" + numero_ammonizioni + ", numero_espulsioni=" + numero_espulsioni + ", partita_giocata=" + partita_giocata + '}';
    }
    
    
}
