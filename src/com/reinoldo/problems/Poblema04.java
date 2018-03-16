package com.reinoldo.problems;



public class Poblema04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long maiorPalindromo = 11;
		long produto = 0;
		for(long i = 999;i >=900; i--){
			
			for(long j = 999; j>=900;j--){
				produto = i*j;
				if(maiorPalindromo < produto && ePalindromo(String.valueOf(produto))){
					maiorPalindromo = produto;
				}
				
			}
		}
		System.out.println(maiorPalindromo);
		  //System.out.println("1. " + ePalindromo("9009"));
		

	}
	
	public static boolean ePalindromo2(String palavra) {
	    return palavra.equals(new StringBuilder(palavra).reverse().toString());
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
