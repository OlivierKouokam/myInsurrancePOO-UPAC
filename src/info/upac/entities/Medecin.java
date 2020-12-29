package info.upac.entities;

import javax.persistence.Entity;

@Entity
public class Medecin extends Personne{
	private String adresseCabinet;
	private String phoneCabinet;
	
	public Medecin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Medecin(String nom, String prenom, String adresse, String dateNaissance, String adresseCabinet, String phoneCabinet) {
		super(nom, prenom, adresse, dateNaissance);
		this.adresseCabinet = adresseCabinet;
		this.phoneCabinet = phoneCabinet;
		// TODO Auto-generated constructor stub
	}
	public String getAdresseCabinet() {
		return adresseCabinet;
	}
	public void setAdresseCabinet(String adresseCabinet) {
		this.adresseCabinet = adresseCabinet;
	}
	public String getPhoneCabinet() {
		return phoneCabinet;
	}
	public void setPhoneCabinet(String phoneCabinet) {
		this.phoneCabinet = phoneCabinet;
	}
	
	
}
