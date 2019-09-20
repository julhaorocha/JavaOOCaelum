package br.com.caelum.contas.modelo;

public class Data {
	public int dia, mes, ano;

public Data(int dia, int mes, int ano) {
		if(dia == 31 && mes == 2) {
			System.out.println("Esta data não é válida");
	}else {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
}

public String toString() {
	return dia + "/" + mes + "/" + ano;
 }
}