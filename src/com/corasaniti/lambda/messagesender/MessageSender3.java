package com.corasaniti.lambda.messagesender;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.corasaniti.lambda.model.Persona;


/*
 * 	Message Sender con l'utilizzo delle lambada expressions
 *  
 *  Con l’uso delle lambda  risolviamo tutti i  problemi visti finora. 
 *  prima di passare all’esempio è necessario fare una precisazione che 
 *  ci permette anche di introdurre una nuova  feature presente in Java 8. 
 *  
 *  Nell’esempio precedente MessageSender2, la scrittura dell’interfaccia 
 *  funzionale ITest passata al metodo delle classi anonime non era 
 *  necessario in quanto Java SE 8 fornisce il package java.util.function 
 *  che contiene un certo numero di interfacce funzionali standard. 
 *  
 *  Rimandando ad altra occasione l’approfondimento di queste interfacce 
 *  funzionali, nel nostro caso possiamo sicuramente dire che l’interfaccia 
 *  Predicate soddisfa le nostre esigenze.
 *  
 */


public class MessageSender3 extends MessageSender{

	
	public List<Persona> getIscrittiFiltratiPer(Predicate<Persona> pred) {
	      List<Persona> persone = new ArrayList<Persona>();
	      for (Persona p:iscritti)
	          if (pred.test(p))
	              persone.add(p);
	 
	      return persone;
    }
	
	
	public static void main(String[] args) {
		
	  MessageSender3 ms = new MessageSender3();	  
	  System.out.println("Uso del MessageSender3 con l'utilizzo delle Lambada Expressions.");
	 
      // Predicates
      Predicate<Persona> allGiovaniDonne = p -> p.getSesso().equals("F") && p.getEta() > 17 && p.getEta() < 30;
      Predicate<Persona> allMaschi 		     = p -> p.getSesso().equals("M");
      Predicate<Persona> allStranieri 	     = p -> !p.getNazionalita().equals("italiana");      
      Predicate<Persona> allCorasaniti 	     = p -> p.getCognome().equals("Corasaniti");
      Predicate<Persona> allCorasanitiMale   = p -> p.getCognome().equals("Corasaniti") && p.getSesso().equals("M");
      Predicate<Persona> allCorasanitiFemale = p -> p.getCognome().equals("Corasaniti") && p.getSesso().equals("F");
      
      //Invio Messaggio a giovani donne
      ms.sendMessage("Per Giovani Donne", ms.getIscrittiFiltratiPer(allGiovaniDonne));
 
      //Invio Messaggio ai maschi
      ms.sendMessage("Per i Maschi     ", ms.getIscrittiFiltratiPer(allMaschi));

      //Invio Messaggio per Stranieri
      ms.sendMessage("Per Stranieri    ", ms.getIscrittiFiltratiPer(allStranieri));
      
      //Invio Messaggio ai Corasaniti
      ms.sendMessage("Per Corasaniti   ", ms.getIscrittiFiltratiPer(allCorasaniti));
      
      //Invio Messaggio ai Corasaniti Maschi
      ms.sendMessage("Per Corasaniti M.", ms.getIscrittiFiltratiPer(allCorasanitiMale));
      
      //Invio Messaggio ai Corasaniti Femmine
      ms.sendMessage("Per Corasaniti F.", ms.getIscrittiFiltratiPer(allCorasanitiFemale));
      
    } 
	
	 
	 
}
