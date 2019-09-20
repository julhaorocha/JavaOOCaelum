package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Data;

public class ContaTeste {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		Conta c2 = new Conta("Paula");
		Conta c3 = new Conta();
		Data c1Dt = new Data(31, 02, 2019);
		Data c2Dt = new Data(28, 02, 2019);
		
		c1Dt.dia = 13;
		c1Dt.mes = 9;
		c1Dt.ano = 2019;
		
		c2Dt.dia = 13;
		c2Dt.mes = 9;
		c2Dt.ano = 2019;
		
		c1.setTitular("Julio");
		c1.setAgencia("4655");
		c1.setNumero(10345);
		c1.depositar(5000.00);
		c1.setDataAbertura(c1Dt);
		
		c2.setAgencia("4566");
		c2.setNumero(10346);
		c2.depositar(10000.00);
		c2.setDataAbertura(c2Dt);
		
		c3.setTitular("Joel");
		c3.setAgencia("4655");
		c3.setNumero(10347);
		c3.depositar(3000.00);
		c3.setDataAbertura(c1Dt);
		
		
		
		
		c1.imprimirDados();
		c2.imprimirDados();
		c3.imprimirDados();
		System.out.println(Conta.getId());
		
				

	}

}
