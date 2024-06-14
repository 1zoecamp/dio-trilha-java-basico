package banco;
import java.util.ArrayList;
import java.util.List;

import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class Main {
	public static void main(String[] args) {
		Banco banco = new Banco();
		banco.setNome("Banco Gatinhos");
		
		Cliente venilton = new Cliente();
		Cliente mariana = new Cliente();
		
		venilton.setNome("Venilton");
		mariana.setNome("Mariana");
		
		Conta ccVenilton = new ContaCorrente(venilton);
		Conta cpVenilton = new ContaPoupanca(venilton);
		
		Conta ccMariana = new ContaCorrente(mariana);
		Conta cpMariana = new ContaPoupanca(mariana);

		ccVenilton.depositar(100);
		ccVenilton.transferir(50, cpMariana);
		
		List<Conta> contas = new ArrayList<Conta>();
		
		contas.add(ccVenilton);
		contas.add(cpVenilton);
		contas.add(ccMariana);
		contas.add(cpMariana);
		
		banco.setContas(contas);
		
		for(Conta c : contas) {
			c.imprimirExtrato();
		}
	}
}
