package com.stefanini.cursojavabasico.estruturacontrole;

public class IfElse {
	public static void main(String[] args) {
		int idade = 18;
		
		if (idade>18) {
			System.out.println("Maior de idade");
		}
		
		if (idade>18) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idade");
		}
		
		if (idade>=100) {
			System.out.println("Virou mumia");
		}else if (idade>=18) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idade");
		}
		
		if(idade>=18)System.out.println("Maior de idade");//If sem chaves só responde a primeira linha.
		
	}
}
