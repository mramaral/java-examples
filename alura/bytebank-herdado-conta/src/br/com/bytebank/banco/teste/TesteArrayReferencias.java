package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		Conta[] contas = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		ContaCorrente cc2 = new ContaCorrente(22, 22);
		ContaPoupanca cp1 = new ContaPoupanca(22, 12);
		
		contas[0] = cc1;
		contas[1] = cc2;
		contas[2] = cp1;
		
		System.out.println(contas[0].getNumero());
		
		ContaCorrente ref = (ContaCorrente)contas[0];
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());

	}

}
