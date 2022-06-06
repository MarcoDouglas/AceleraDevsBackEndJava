package br.com.stefanini.estruturasdecontrole;

public class While {
	public static void main(String[] args) {
		int count =1 ;
		
		/*
		 * while (count< 100) { System.out.println(count); count++; }
		 */
		// Executa pelo menos uma vez
		do {
			System.out.println(count);
			count++;
		} while (count < 100); 
		
	}
}
