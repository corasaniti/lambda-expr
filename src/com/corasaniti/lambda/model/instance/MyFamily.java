package com.corasaniti.lambda.model.instance;

import java.util.Arrays;
import java.util.List;

import com.corasaniti.lambda.model.Persona;

public class MyFamily {
	
	List<Persona> myFamily = Arrays.asList(
		       new Persona("Francesco", "Corasaniti", "M", 38, "italiana"),
		       new Persona("Vittoria", "Corasaniti", "F", 40, "italiana"),	       
		       new Persona("Piero", "Corasaniti", "M", 46, "italiana"),		       
		       new Persona("Paolo", "Corasaniti", "M", 76, "italiana"),
		       new Persona("Enza", "Capano", "F", 70, "italiana")
		    );

	public List<Persona> getMyFamily() {
		return myFamily;
	}
	
}
