package com.corasaniti.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.corasaniti.lambda.model.MyFamily;

/*
 * Esempio di Lambda Expression 
 * con utilizzo degli Stream
 * metodo forEach(..), filer(..), map(..), sorted()
 */
public class ForeachExample {

	public static void main(String[] args) {
		
		//Crea la lista di interi
		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
				
		//Stampa il doppio di ogni numero
		System.out.println("Stampa il doppio di ogni numero");
		numberList.forEach((i)-> System.out.print(numberList.get(i-1)*2+ " "));
		
		//Recupera lo stream a partire dalla lista
		Stream<Integer> streamInt = numberList.stream();
		System.out.println("");
		//Stampa il quadrato di ogni numero
		System.out.println("Stampa il quadrato di ogni numero");
		streamInt.forEach((p)->System.out.print(p*p +" "));
		
		//Stampa i numeri Dispari
		System.out.println("");
		System.out.println("Stampa i numeri Dispari");		
		numberList.stream().filter(n -> n % 2 != 0).forEach(System.out::print); 		
		System.out.println("");
		numberList.stream().filter(n -> n % 2 != 0).forEach((n)->System.out.print(n));
		
		System.out.println();
		List<String> stringList = Arrays.asList("a1", "c6", "a2", "b1", "c2", "c1", "c5", "c3");
		stringList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);
				
		//Stampa le donne della mia famiglia
		MyFamily myFamily = new MyFamily();
		System.out.println("Stampa le donne della mia famiglia");
		myFamily.getMyFamily().stream().filter((p)->p.isFemale()).forEach((p)->System.out.println(p));
		
		//Stampa gli uomini della mia famiglia
		System.out.println("Stampa gli uomini della mia famiglia");
		myFamily.getMyFamily().stream().filter((p)->!p.isFemale()).forEach((p)->System.out.println(p));

	}
	
}
