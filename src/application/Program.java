package application;

import java.util.Locale;
import java.util.Scanner;
import entitiies.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double valor;
		
		ContaBancaria conta  = new ContaBancaria();
		
		System.out.print("Entre com o número da conta: ");
		int numero = sc.nextInt();
		sc.nextLine(); // Quebra de linha 
		System.out.print("Entre com o nome do cliente: ");
		String cliente = sc.nextLine();
		
		ContaBancaria contaBancaria = new ContaBancaria(numero, cliente);
		
		char active = 's';
		System.out.print("Há depósito inicial (s/n)? ");
		active = sc.next().charAt(0);
		
		if (active == 's') {
			System.out.print("Informe valor do depósito: ");
			valor = sc.nextDouble();
			contaBancaria.deposito(valor);
			System.out.print("\nDados da conta: " + contaBancaria);
			
		}else {
			System.out.print("\nDados da conta: " + contaBancaria);
		}
		System.out.print("\nInforme valor do depósito: ");
		valor = sc.nextDouble();
		contaBancaria.deposito(valor);
		System.out.print("\nDados da conta atualizados: " + contaBancaria);
		
		System.out.print("\nInforme valor do saque: ");
		valor = sc.nextDouble();
		contaBancaria.saque(valor);
		System.out.print("\nDados da conta atualizados: " + contaBancaria);
		
		sc.close();

	}

}
