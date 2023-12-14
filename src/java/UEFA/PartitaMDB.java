/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/MessageDrivenBean.java to edit this template
 */
package UEFA;

import javax.ejb.*;
import javax.jms.*;
import java.util.logging.*;
import javax.inject.*;
import javax.enterprise.event.Event;


/**
 *
 * @author Antonio
 */
@MessageDriven(mappedName = "jms/javaee7/Topic") 
    
    
public class PartitaMDB implements MessageListener {
    
    @Inject
    private PartitaEJB ejb;
    
    @Inject
    Event<Partita> event;
    
    @Inject @Italia
    Event<Partita> italiaEvent;
    
    @Override
    public void onMessage(Message msg) {
        try {
            MessageWrapper wrapper = msg.getBody(MessageWrapper.class);
            Integer id = wrapper.getId();
            Integer numero_goal = wrapper.getNumero_goal();
            String squadra = wrapper.getSquadra();
            
            Partita p = ejb.trovaPerId(id);
            if(p.getSc().equals(squadra))
                p.setNumero_goal_sc(p.getNumero_goal_sc()+numero_goal);
            else if (p.getSo().equals(squadra))
                    p.setNumero_goal_so(p.getNumero_goal_so()+numero_goal);
            p = ejb.aggiornaPartita(p);
            
            if(squadra.equals("Italia"))
                italiaEvent.fire(p);
            else
                event.fire(p);            
        } catch (JMSException ex) {
            Logger.getLogger(PartitaMDB.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
}
