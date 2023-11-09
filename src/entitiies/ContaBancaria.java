package entitiies;

public class ContaBancaria {
	
	private int numeroConta;
	private String nome;
	private double saldo;
	private double tarifa=5.00;
	
	
	public ContaBancaria() {
	}
	
	public ContaBancaria(int numeroConta, String nome, double saldo, double tarifa) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = saldo;
		this.tarifa = tarifa;
	}
	
	public ContaBancaria(int numeroConta, String nome, double saldo) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double valor) {
		this.saldo -= (valor+tarifa);
	}
	
	@Override
	public String toString() {
		return "Dados da conta: "
							+ "\nConta: "
							+ numeroConta 
							+ ", Cliente: " 
							+ nome 
							+ ", Saldo: $ " 
							+ String.format("%.2f", nome);
	}	
		
}
