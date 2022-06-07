package com.stefanini.cursojavabasico.vetoresematrizes;
//TESTE DE COMMIT.

public class AulaQuatro {
	//Vetores
		public static void main(String[] args) {
			
		
		int notas[]  = new int[10];
		
		notas[0] = 1;
		notas[2] = 5;
		notas[6] = 9;
		notas[4] = 2;
		notas[1] = 4;
		notas[9] = 7;
		notas[7] = 8;
		// notas[11] = 10;

		for (int contador = 0; contador< notas.length; contador++){
			System.out.println(notas[contador]);
		}

		String carros[] = new String[] {"BMW i320" , "Mercedes c180", "BMW M3", "Mercedes AMG","Tesla Model S"};
		
		System.out.println(carros.length);	

		for (String carro:carros){  //carro t� recebendo de carros.
			System.out.println(carro);			
		}	

		//Matrizes
		int lista[][]= {{0,0}, {0,1}, {1,1}};
		
		
		 int i, j;
		 for (i=0; i<lista.length; i++) {
		    System.out.printf("%da. linha: ", (i+1));
		    for (j=0; j<lista[i].length; j++) {
		       System.out.printf("%d ", lista[i][j]);
		    }
		    System.out.printf("\n");
		 }
	
		}
}
