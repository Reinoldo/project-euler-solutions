package com.reinoldo.problems;

import java.util.Scanner;

public class Poblema04 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Digite a quantidade de digitos a ser multiplicado (Ex: 3): ");
		int digitos = in.nextInt();
		
		//inicializa o array 
		char[] palavra = new char[digitos];		
		
		for(int i = 0; i < digitos;i++){
			palavra[i] = '9';
			
		}
		//Transforma o array de char em String
		String palavra2 = new String(palavra);
		Integer numeros = 0;
		//Converte String em inteiro
		numeros = numeros.parseInt(palavra2);
		
		
		long maiorPalindromo = 2;
		long produto = 0;
		
		for(long i = numeros;i >=1; i--){
			
			for(long j = numeros; j>=1;j--){
				produto = i*j;
				if(maiorPalindromo < produto && ePalindromo(String.valueOf(produto))){
					maiorPalindromo = produto;
					break;
				}
				
			}
		}
		System.out.println(maiorPalindromo);
		  
		

	}
	
	 public static boolean ePalindromo(String palavra) {
	        int meio = palavra.length() / 2;
	        for (int i = 0; i < meio; i++) {
	            if (palavra.charAt(i) != palavra.charAt(palavra.length()-1 - i)) {
	                return false;
	            }
	        }
	        return true;
	    }

}
