package com.reinoldo.problems;

import java.util.ArrayList;
import java.util.List;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numeros = new ArrayList<Integer>();
		int listaDePrimos = 0;

		for (int i = 0; i <= 120000; i++) {
			numeros.add(i);
		}
		int contador;
		int numero = 0;
		
			
			for (Integer i : numeros) {
				contador = 0;
				
				for (int u = 1; u <= i; u++) {
					
					if (i % u == 0) {
						contador++;
						numero = u;
					}
				}
				if (contador == 2) {
					listaDePrimos++;
					if(listaDePrimos == 10002){
						System.out.println("O Número: " + numero + " é primo e esta na posicao: " + listaDePrimos);
						break;
					}
					
				}
			}
		

	}

}
