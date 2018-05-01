package com.danilo.alura.bytebank.composicao;

import com.danilo.alura.bytebank.composicao.Conta;

public class TestaComposicao {

	public static void main(String[] args) {
		Conta contaDoDanilo = new Conta();
		Conta contaDaThais = new Conta();
		
		System.out.println(contaDoDanilo.saldo);
		System.out.println(contaDaThais.saldo);
		
		System.out.println(contaDoDanilo.titular);
	}
}
