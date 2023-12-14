/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UEFA;
import java.io.*;
/**
 *
 * @author Antonio
 */
public class MessageWrapper implements Serializable {
    private int id;
    private int numero_goal;
    private String squadra;

    public MessageWrapper(int id, int numero_goal, String squadra) {
        this.id = id;
        this.numero_goal = numero_goal;
        this.squadra = squadra;
    }

    public int getId() {
        return id;
    }

    public int getNumero_goal() {
        return numero_goal;
    }

    public String getSquadra() {
        return squadra;
    }
    
    
}
