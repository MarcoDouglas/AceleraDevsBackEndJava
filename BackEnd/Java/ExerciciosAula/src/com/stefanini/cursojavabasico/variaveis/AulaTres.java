package com.stefanini.cursojavabasico.variaveis;

public class AulaTres {
	public static void main(String[] args) {
		//TIPOS PRIMITIVOS

		byte numByte = -128; // -128 a 127 (8 bits).
		short numShort = 12321; // -32768 a 32767 (16 bits).
		int numInt = 2147483647; // -2.147.483.648 a 2.147.483.647 (32 bits).
		long numLong = 2147483648l; // -9.223.372.036.854.770.000 a 9.223.372.036.854.770.000 (64 bits), *Usar o ( l ) caso seja maior que a capacidade de int.
		System.out.println(numByte+"/"+numShort+"/"+numInt+"/"+ numLong);
		//Pontos flutuantes 
		
		float numFloat = 10.000f; //*Usar o ( f ) pra identificar, -494E-307 a 3.40282347E+38 (32 bits)
		double numDouble = 1000000; // *-4,94E-307 1.79769313486231570E+308
		System.out.println(numFloat+"/ "+numDouble);
		//Caracteres 
		char varChar = 'F';  // *Obrigatório aspas simples, 0 a 65535 (16bits)
		boolean varBoolean = true; // true ou false (1bit)	
		System.out.println(varChar+"/"+varBoolean);
	}
}
