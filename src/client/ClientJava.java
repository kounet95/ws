package client;

import service.BanqueService;
import service.Compte;

public class ClientJava {

	public static void main(String[] args) {
		BanqueService stup = new BanqueService();
		double cv = stup.conversion(122);
		System.out.println("conversion de 122 ="+cv);
		//recupere un compte
		

	}

}
