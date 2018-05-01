package com.danilo.alura.bytebank.encapsulamento;

public class TestaGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(3377);
		System.out.println(conta.getNumero());

		Cliente danilo = new Cliente();
		// conta.titular = danilo;
		conta.setTitular(danilo);
		System.out.println(conta.getTitular());

		// Atribuindo através do encapsulamento
		conta.getTitular().setNome("Danilo");
		conta.getTitular().setCpf("222.222.222-22");
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getCpf());

		conta.getTitular().setProfissao("programador");
		// agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(conta.getTitular());
		System.out.println(titularDaConta.getProfissao());
	}
}
