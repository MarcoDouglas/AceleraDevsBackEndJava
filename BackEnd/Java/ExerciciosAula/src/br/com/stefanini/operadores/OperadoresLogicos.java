package br.com.stefanini.operadores;

public class OperadoresLogicos {
	/**
	 *
	 * AND
	 *V and F => F
	 *V and V => V
	 *F and V => F
	 *F and F => F
	 * 
	 * OR
	 *V or F => V
	 *V or V => V
	 *F or V => V
	 *F or F => F 
	 *
	 * XOR
	 *
	 *V xor F => V
	 *V xor V => F
	 *F xor V =>  V
	 *F xor F => F
	 *
	 *Negação Lógica
	 *!V = F
	 *!F =V
	 */
	  public static void main(String[] args) {
		
		
		boolean v = true;
		boolean f = false;
	
		//AND: && Se a primeira condição estiver errada vai testar somente a primeira
		//AND: & Testa todas condições
		//OR:||
	
		System.out.println(v && f);
		System.out.println(v || f);
		System.out.println(v !=f);
		System.out.println(!v);
	  }
}
