package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;
import java.util.List;
import java.util.ArrayList;

public class TesteOrdenacao {

	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(22, 33);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		for(Conta conta: lista) {
			System.out.println(conta);
		}
		
		NumeroDaContaComparator comparator = new NumeroDaContaComparator();
		lista.sort(comparator);
		
		System.out.println("---------------------//----------------------");
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}