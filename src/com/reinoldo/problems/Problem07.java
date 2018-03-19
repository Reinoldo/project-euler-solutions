package com.reinoldo.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite a posição do número primo a qual deseja saber:  ");
		long posicao = in.nextLong();
		long tamanhoArray = 0;
		
		//Margem do array para se achar os néumeros primos
		tamanhoArray = posicao * 100;
		
		List<Integer> numeros = new ArrayList<Integer>();
		int listaDePrimos = 0;

		for (int i = 0; i <= tamanhoArray; i++) {
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
					if(listaDePrimos == posicao){
						System.out.println("O número primo da posição  " + posicao + " é: " + numero);
						break;
					}
					
				}
			}
		

	}

}
