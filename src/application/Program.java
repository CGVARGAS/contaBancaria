package application;

import java.util.Locale;
import java.util.Scanner;
import entitiies.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ContaBancaria conta  = new ContaBancaria();
		
		System.out.print("Entre com o número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Entre com o nome do cliente: ");
		String cliente = sc.next();
		
		ContaBancaria contaBancaria = new ContaBancaria(numero, cliente);
		
		char active = 's';
		System.out.print("Há depósito inicial (s/n)? ");
		active = sc.next().charAt(0);
		
		if (active == 's') {
			System.out.print("informe valor do depósito: ");
			double valor = sc.nextDouble();
			contaBancaria.deposito(valor);
			System.out.print(contaBancaria);
		
		}else {
			
			System.out.print(contaBancaria);
		}
		
		sc.close();

	}

}
