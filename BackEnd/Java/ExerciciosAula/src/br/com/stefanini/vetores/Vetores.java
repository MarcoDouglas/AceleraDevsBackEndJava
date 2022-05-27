package br.com.stefanini.vetores;

public class Vetores {
	public static void main(String[] args) {
		
		int notas[] = new int[11] ;
		notas[0] = 5;
		notas [3] = 9;
		
		System.out.println(notas.length);
		
		for (int i = 0; i< notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		String meses [] = new String[] {"Janeiro", "Fevereiro","Março", "Abril", "Maio"};
		
		for (String m:meses) {
			System.out.println(m);
		}
		
		int matriz [][] = new int [5][5];
		matriz [0][1]= 5;
		matriz [2][4]= 10;
		matriz [4][4]= 15;
		
		for(int m [] : matriz) {
			for (int v:m) {
				System.out.println(v);
			}
			
		}
			
	}
}
