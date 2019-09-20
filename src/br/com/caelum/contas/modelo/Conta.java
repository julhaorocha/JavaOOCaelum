package br.com.caelum.contas.modelo;
/**
 * Classe responsável por moldar as contas do banco
 * 
 * @author Julio Rocha*/


public class Conta {
	
	private static int id;
	private int idConta;
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataAbertura;
	

	public Conta() {
		Conta.id = Conta.id + 1;
		this.idConta = Conta.id;
	};
	

	public Conta(String titular) {
		Conta.id = Conta.id + 1;
		this.idConta = Conta.id;
		this.titular = titular;
		
	}
	
	

	public static int getId() {
		return Conta.id;
	}


	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}
	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Data getDataAbertura() {
		return dataAbertura;
	}
	
	public boolean sacar(double saque) {
		if(saque > this.saldo) {
			return false;
		}else {
			this.saldo -= saque;
			return true;
		}
	}

	public boolean depositar(double deposito) {
		if(deposito > 0) {
			this.saldo += deposito;
			return true;
		}else {
			System.out.println("O valor do deposito não pode ser igual a zero");
			return false;
		}
	}
	
	public void rendimentoMensal() {
		this.saldo += this.saldo * 0.1;
	}
	
	public void imprimirDados() {
		System.out.println("Indentificador: " + this.idConta);
		System.out.println("Titular: " + this.titular);
		System.out.println("Numero: " + this.numero);
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Data de Abertura: " + this.dataAbertura);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("=========================");
	}
	
}
