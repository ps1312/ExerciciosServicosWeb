package br.cin.ufpe;

import com.cdyne.ws.*;

public class WSConsumer {
	public static void main(String[] args) {
		String IP_ADDL = "191.187.153.217";
		IP2Geo ipdados= new IP2Geo();
		IPInformation info = ipdados.getIP2GeoSoap().resolveIP(IP_ADDL   , "0");
		System.out.println(info.getCountry());
		System.out.println(info.getCity());
		System.out.println(info.getLatitude());
		System.out.println(info.getLongitude());
	}

}