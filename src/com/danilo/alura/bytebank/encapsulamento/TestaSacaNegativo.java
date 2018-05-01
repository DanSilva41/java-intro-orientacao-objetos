package com.danilo.alura.bytebank.encapsulamento;

public class TestaSacaNegativo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
        conta.deposita(100);
        conta.saca(200);
        System.out.println(conta.getSaldo());
        
        //acessando o atributo diretamente X proibido
        //conta.saldo = conta.saldo - 101;
        System.out.println(conta.getSaldo());
	}
}
