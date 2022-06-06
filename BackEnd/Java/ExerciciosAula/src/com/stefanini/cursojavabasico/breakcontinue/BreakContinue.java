package com.stefanini.cursojavabasico.breakcontinue;

public class BreakContinue {
	public static void main(String[] args) {
		String [] carros = new String [] {"BMW i320","Mercedes c180", "BMW M3", "Mercedes AMG", "Tesla MOdel S"};
		
		for(int i=0;i <carros.length; i++) {
			if (carros[i] == "BMW i320") {		
			System.out.println(carros[i]);
			//break;
			continue;
			}
		System.out.println(carros[i]);
		System.out.println("Quero esse carro" + carros[i]);
		}		
	}
}
