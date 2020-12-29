package info.upac.entities;

import javax.persistence.Entity;

@Entity
public class Patient extends Personne{
	private String numeroSecuriteSocial;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String nom, String prenom, String adresse, String dateNaissance, String numeroSecuriteSocial) {
		super(nom, prenom, adresse, dateNaissance);
		this.numeroSecuriteSocial = numeroSecuriteSocial;
		// TODO Auto-generated constructor stub
	}

	public String getNumeroSecuriteSocial() {
		return numeroSecuriteSocial;
	}

	public void setNumeroSecuriteSocial(String numeroSecuriteSocial) {
		this.numeroSecuriteSocial = numeroSecuriteSocial;
	}
	
	
}
