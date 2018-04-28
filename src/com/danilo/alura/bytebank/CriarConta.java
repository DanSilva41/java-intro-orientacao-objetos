package com.danilo.alura.bytebank;

public class CriarConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.0;
		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;

		System.out.println("A primeira conta tem " + primeiraConta.saldo);
		System.out.println("A segunda conta tem " + segundaConta.saldo);

		// Valores default
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);

		// int : 0
		// double: 0
		// boolean: false

		// Testando referências
		if (primeiraConta == segundaConta)
			System.out.println("São às mesmas contas");
		else
			System.out.println("São contas DIFERENTES!");

		// Endereço de memória
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
