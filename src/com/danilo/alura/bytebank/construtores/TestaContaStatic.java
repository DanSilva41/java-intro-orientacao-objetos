package com.danilo.alura.bytebank.construtores;

public class TestaContaStatic {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		Conta outraConta = new Conta(4564, 89844);
		Conta ultimaConta = new Conta(6559, 32659);
		
		System.out.println(Conta.getTotal());
	}
}
