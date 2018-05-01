package com.danilo.alura.bytebank.composicao;

public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente danilo = new Cliente();
		danilo.nome = "Danilo SIlva";
        danilo.cpf = "222.222.222-22";
        danilo.profissao = "Desenvolvedor";
        
        Conta contaDoDanilo = new Conta();
        contaDoDanilo.deposita(100);
        
        contaDoDanilo.titular = danilo;
        System.out.println(contaDoDanilo.titular.nome);
        System.out.println(contaDoDanilo.titular);
	}
}
