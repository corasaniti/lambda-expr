package com.corasaniti.lambda.messagesender;

import java.util.ArrayList;
import java.util.List;

import com.corasaniti.lambda.model.Persona;

/*
 * 	Message Sender con l'utilizzo 
 *  delle classi Anonime
 *  
 *  Vediamo adesso la soluzione mediante l’uso delle “vecchie” classi anonime, 
 *  utilizzandole in maniera congiunta ad un interfaccia funzionale (ITest.java)  
 *  con un unico metodo test che restituisce un boolean. 
 *  
 *  Qui i criteri di ricerca possono essere passati quando il metodo viene chiamato. 
 *  L’interfaccia ITest può essere una cosa simile:
 *  
 *  
 */

public class MessageSender2 extends MessageSender {
	
	public List<Persona> getIscrittiFiltratiPer(ITest<Persona> aTest) {
	      List<Persona> persone = new ArrayList<Persona>();
	      for (Persona p:iscritti)
	          if (aTest.test(p))
	              persone.add(p);
	 
	      return persone;
	}
	
	
	public static void main(String[] args) 
	{
	      
	  //Instanzio il Message Sender di tipo 2
	  MessageSender2 ms = new MessageSender2(); 
	  System.out.println("Uso del MessageSender2 con l'utilizzo delle Classi Anonime.");
	 
	  //Invio Messaggio a giovani donne
      ms.sendMessage("Per Giovani Donne", ms.getIscrittiFiltratiPer(new ITest<Persona>() {
          @Override
          public boolean test(Persona p){
            return p.getSesso().equals("F") && p.getEta() > 17 && p.getEta() < 30;
          }
        }
      ));
 
      //Invio Messaggio ai maschi
      ms.sendMessage("Per i Maschi     ", ms.getIscrittiFiltratiPer(new ITest<Persona>() {
          @Override
          public boolean test(Persona p){
            return p.getSesso().equals("M");
          }
        }
      ));
 
      //Invio Messaggio per stranieri
      ms.sendMessage("Per Stranieri    ", ms.getIscrittiFiltratiPer(new ITest<Persona>(){
          @Override
          public boolean test(Persona p){
             return !p.getNazionalita().equals("italiana");  
          }
        }
      ));	    
      
	} 		
}
