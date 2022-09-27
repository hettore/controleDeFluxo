package entities;

import java.util.Locale;

public class CaixaEletronico {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double saldo = 25.0;
		double valorSolicitado = 26.0;
		
		if (valorSolicitado < saldo) {
			saldo = saldo - valorSolicitado;
			System.out.println("Foi sacado R$ " + String.format("%.2f", valorSolicitado) + " Saldo atual: " + saldo );
		}
		else {
			
		System.out.println("Saldo insuficiente! Você quer sacar R$ "  + String.format("%.2f", valorSolicitado) + " Mas o valor disponível é R$ " + String.format("%.2f", saldo));
		}
	}

}
