package com.stefanini.cursojavabasico.estruturacontrole;

import java.util.Iterator;

public class Loop {
	public static void main(String[] args) {
		int count = 10;
		
		while(count < 100) {
				System.out.println("count: " + count);
				count++;
		}
		
		int countDois =10;
		
		//Vai executar pelo uma vez  pra dois realizar a checagem; 
		do {
			System.out.println(countDois);
			countDois++;
		}while (countDois < 100);
		
		//for normal
		for(int i =0; i <100;i++ ) {
			System.out.println(i);
		}
		
		//for em areas ausentes
		int i=0;
		for(; i <100; ) {
			System.out.println(i);
			i++;
		}
		
		//for infinito
		
		 for(;;) {
			 System.out.println("Loop infinito");
		 }
		 
		
	}
}
