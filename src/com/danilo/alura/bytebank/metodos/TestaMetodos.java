package com.danilo.alura.bytebank.metodos;

public class TestaMetodos {

	public static void main(String[] args) {
		Conta contaDoDanilo = new Conta();
		contaDoDanilo.saldo = 100;
		contaDoDanilo.deposita(50);
		System.out.println(contaDoDanilo.saldo);

		boolean conseguiuRetirar = contaDoDanilo.saca(20);
		System.out.println(contaDoDanilo.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaDaThais = new Conta();
		contaDaThais.deposita(1000);

		boolean conseguiuTransferir = contaDaThais.transfere(300, contaDoDanilo);
		if (conseguiuTransferir) {
			System.out.println("Transferência realizado com sucesso!");
		} else {
			System.out.println("Faltou dinheiro!");
		}

		System.out.println(contaDoDanilo.saldo);
		System.out.println(contaDaThais.saldo);
	}
}
