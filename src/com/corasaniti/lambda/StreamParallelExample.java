package com.corasaniti.lambda;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamParallelExample {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{				
		long t0=System.nanoTime();
		int[] sequential=IntStream.range(0, 1000000).filter(p -> p > 1).toArray();		
		long t1=System.nanoTime();
		int[] parallel=IntStream.range(0, 1000000).parallel().filter(p -> p > 1).toArray();
		long t2=System.nanoTime();
		
		System.out.printf("Sequential Time: %.2fs, Parallel Time: %.2fs%n", (t1-t0)*1e-9, (t2-t1)*1e-9);
		
		System.out.println("********************************************");
		
		long t0Seq = System.nanoTime();
		int[] prime = IntStream.range(0, 1000000).filter(n->isPrime(n)).toArray();
		long t1Seq =System.nanoTime();
		System.out.printf("Prime Sequential Size " + prime.length + " Time %.2fs", (t1Seq-t0Seq)*1e-9);
		
		System.out.println("");
		
		long t0Par =System.nanoTime();
		int[] primePar    = IntStream.range(0, 1000000).parallel().filter(n->isPrime(n)).toArray();
		long t1Par =System.nanoTime();
		System.out.printf("Prime Parallel   Size " + primePar.length + " Time %.2fs", (t1Par-t0Par)*1e-9);
		System.out.println("");
		System.out.println("**************************************");
		
		
	}
	
	/*
	 * Check if a number is 
	 * prime and return true
	 */
	public static boolean isPrime(final int number) {
		   return LongStream.range(2,(int) Math.ceil(Math.sqrt(number + 1))).noneMatch(x -> number % x == 0);
		}
}
