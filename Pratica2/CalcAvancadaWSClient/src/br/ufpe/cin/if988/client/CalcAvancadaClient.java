package br.ufpe.cin.if988.client;

import br.ufpe.cin.if998.CalcPlusPlusProxy;

import java.rmi.RemoteException;

import br.ufpe.cin.if998.CalcPlusPlus;

public class CalcAvancadaClient {

	public static void main(String[] args) throws RemoteException {

		int v1 = 2;
		int v2 = 3;

		CalcPlusPlusProxy proxy = new CalcPlusPlusProxy();
		CalcPlusPlus calc = proxy.getCalcPlusPlus();
		System.out.println(v1 + "^" + v2 + "=" + calc.potencia(v1, v2));
	}
}