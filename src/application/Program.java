package application;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
	 	  
		Scanner entrada = new Scanner(System.in);
		
		
		int x = entrada.nextInt();
		int y = entrada.nextInt();
		int z = entrada.nextInt();

		if(operacao(x,y,z) > 10) {
		System.out.println(operacao(x,y,z));
		}
		else { 
		System.out.println("Não e maior que 10");
		}
		
		entrada.close();
	}

	private static int operacao(int x, int y, int z) {
		return x+y/z;
	}

}

