package com.danilo.alura.bytebank.encapsulamento;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

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

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
