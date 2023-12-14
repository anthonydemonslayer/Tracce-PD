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
public class ItaliaGoalNotification {
    public void notify(@Observes @Italia Partita p) {
        System.out.println("Aleeeeeeeeeeee :-)");
    }
}
