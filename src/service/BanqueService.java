package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.Compte;
@WebService(name ="conversion")
public class BanqueService {
	@WebMethod(operationName = "conversionEuroEnDh")
	public Double conversion(@WebParam(name="montant") double mt) {
		return mt * 11.3;
	}
    @WebMethod
	public Compte getcompte( @WebParam(name = "code")Long condeCompte) {return new Compte(condeCompte, new Date(), Math.random() * 80000);}
	@WebMethod
	public List<Compte> getComptes(){
		List<Compte> comptes = new ArrayList<Compte>();
		comptes.add(new Compte(1L, new Date(), Math.random() * 80000));
		comptes.add(new Compte(2L, new Date(), Math.random() * 80000));
		comptes.add(new Compte(3L, new Date(), Math.random() * 80000));
		return comptes;
	}
}
