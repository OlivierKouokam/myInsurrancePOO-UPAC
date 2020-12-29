package info.upac.entities;

import javax.persistence.Entity;

@Entity
public class Specialiste extends Medecin{
	private String specialite;
	private float tarifHonoraires;
	public Specialiste() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Specialiste(String nom, String prenom, String adresse, String dateNaissance, String adresseCabinet,
			String phoneCabinet, String specialite, float tarifHonoraires) {
		super(nom, prenom, adresse, dateNaissance, adresseCabinet, phoneCabinet);
		this.specialite = specialite;
		this.tarifHonoraires = tarifHonoraires;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public float getTarifHonoraires() {
		return tarifHonoraires;
	}
	public void setTarifHonoraires(float tarifHonoraires) {
		this.tarifHonoraires = tarifHonoraires;
	}
	
	
}
