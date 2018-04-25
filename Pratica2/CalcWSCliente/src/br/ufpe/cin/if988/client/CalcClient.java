package br.ufpe.cin.if988.client;

import br.ufpe.cin.if988.CalcPlusPlus;
import br.ufpe.cin.if988.CalcPlusPlusService;

public class CalcClient {

	public static void main(String[] args) {
		
		int v1 = 4;
		int v2 = 2;
		CalcPlusPlusService calculadoraService = new CalcPlusPlusService();
		CalcPlusPlus cal = calculadoraService.getCalcPlusPlus();
		System.out.println(v1 + "^" + v2 + " = " + cal.potencia(v1, v2));

	}

}
