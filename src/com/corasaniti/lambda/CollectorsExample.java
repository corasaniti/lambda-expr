package com.corasaniti.lambda;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import com.corasaniti.lambda.model.MyFamily;
import com.corasaniti.lambda.model.Persona;

/*
 * java.util.stream.Collectors Example
 * 
 * http://www.baeldung.com/java-8-collectors
 * https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html
 */
public class CollectorsExample {

    public static void main(String[] args) {
    	
    	//Create My Family
    	MyFamily myFamily = new MyFamily();
    	
    	//Create a Stream instance representing a sequence of elements and collect(raccoglie) them into a LinkedList instance
    	List<Persona> familyList = myFamily.getMyFamily().stream().collect(Collectors.toCollection(LinkedList::new));
    	familyList.forEach(System.out::println);
    	
        //Accumulate il nome into a List
        List<String> list = myFamily.getMyFamily().stream().map(Persona::getNome).collect(Collectors.toList());
        list.forEach(System.out::println);
        
        
        //Compute sum of dell'età delle persone della famiglia
        int totalYear = myFamily.getMyFamily().stream().collect(Collectors.summingInt(Persona::getEta));        
        System.out.println("La somma totale degli anni della mia famiglia è:" + totalYear);
        
       
    	
    }
}
