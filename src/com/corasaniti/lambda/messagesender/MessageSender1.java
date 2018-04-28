package com.corasaniti.lambda.messagesender;

import java.util.ArrayList;
import java.util.List;

import com.corasaniti.lambda.model.Persona;

public class MessageSender1 extends MessageSender{

	
	public List<Persona> getGiovaniDonne() {
		List<Persona> giovaniDonne = new ArrayList<Persona>();
		for (Persona p:iscritti)
			if (p.getSesso().equals("F") && p.getEta() > 17 && p.getEta() < 30)
				giovaniDonne.add(p);	 
		return giovaniDonne;      
	}
	
	
	public List<Persona> getMaschi() {
		List<Persona> maschi = new ArrayList<Persona>();
		for (Persona p:iscritti)
		    if (p.getSesso().equals("M"))
		    	maschi.add(p);
		 
		return maschi;
	}
	
	public List<Persona> getStranieri() {
	      List<Persona> stranieri = new ArrayList<Persona>();
	      for (Persona p:iscritti)
	          if (!p.getNazionalita().equals("italiana"))
	        	  stranieri.add(p);
	 
	      return stranieri;
	}
	
	
	public static void main(String[] args) {
	      MessageSender1 ms = new MessageSender1();
		  System.out.println("Uso del MessageSender1 utilizzo classico.");
	      ms.sendMessage("messaggioX", ms.getGiovaniDonne());
	      ms.sendMessage("messaggioY", ms.getMaschi());
	      ms.sendMessage("messaggioZ", ms.getStranieri());
	    }
	
}
