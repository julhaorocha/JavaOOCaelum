package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	
	public void criaConta() {
		
		Conta conta = new Conta();
		conta.setAgencia("1234");
		conta.setNumero(56789);
		conta.setTitular("Julio");
	}
}
