package com.danilo.alura.bytebank.construtores;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	private static int total;

	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		Conta.total++;
		System.out.println("Estou criando uma conta!");
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}

		return false;
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			// this.saldo -= valor;
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}

		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	/*
	 * N�o precisamos de setSaldo(), pois n�o queremos disponibilizar isto. Somente
	 * atrav�s do m�todos de transa��o � poss�vel alterar o saldo
	 */

	public int getAgencia() {
		return this.agencia;
	}

	// Omitir este setter, caso queira
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	// Omitir este setter, caso queira
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("n�o pode valor <= 0");
			return;
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return total;
	}

}
