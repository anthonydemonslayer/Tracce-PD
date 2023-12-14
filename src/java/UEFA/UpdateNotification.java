/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UEFA;
import javax.enterprise.event.*;

/**
 *
 * @author Antonio
 */
public class UpdateNotification {
    public void notify(@Observes Partita p) {
        System.out.println("Aggiornamento effettuato: " + p);
        
    }
}
