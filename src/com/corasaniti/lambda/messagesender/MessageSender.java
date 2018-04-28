package com.corasaniti.lambda.messagesender;

import java.util.Arrays;
import java.util.List;

import com.corasaniti.lambda.model.Persona;

public class MessageSender {

	List<Persona> iscritti = Arrays.asList(
		       new Persona("Mario", "Rossi", "M", 35, "italiana"),
		       new Persona("Lucy", "Parker", "F", 22, "inglese"),
		       new Persona("Francesco", "Corasaniti", "M", 38, "italiana"),
		       new Persona("Vittoria", "Corasaniti", "F", 40, "italiana"),
		       new Persona("Gianni", "Bianchi", "M", 20, "italiana"),
		       new Persona("Fabio", "Marchi", "M", 40, "italiana"),		       
		       new Persona("Piero", "Corasaniti", "M", 46, "italiana"),		       
		       new Persona("John", "Simpson", "M", 18, "USA"),
		       new Persona("Paolo", "Corasaniti", "M", 76, "italiana"),
		       new Persona("Adele", "Fabi", "F", 20, "italiana")
		    );
	
	
	public void sendMessage(String msg, List<Persona> persone){
	       // Logica di Invio messaggio
	       System.out.println("Inviato messaggio " + msg + " a "+persone.size()+" iscritti");
	     }
}
