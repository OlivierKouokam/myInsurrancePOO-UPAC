package info.upac.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity

//@DiscriminatorValue("SPECIALISTE")
@PrimaryKeyJoinColumn(name = "id")
public class Specialiste extends Medecin{
	private String specialite;
	private float tarifHonoraires;
	
	@OneToMany(mappedBy = "specialiste")
	private List<VisiteSpecialiste> visiteSpecialistes;
 	
	public Specialiste() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Specialiste(String adresseCabinet, String phoneCabinet, List<Consultation> consultations) {
		super(adresseCabinet, phoneCabinet, consultations);
		// TODO Auto-generated constructor stub
	}

	public Specialiste(String nom, String prenom, String adresse, String dateNaissance, String adresseCabinet,
			String phoneCabinet) {
		super(nom, prenom, adresse, dateNaissance, adresseCabinet, phoneCabinet);
		// TODO Auto-generated constructor stub
	}

	public Specialiste(String specialite, float tarifHonoraires, List<VisiteSpecialiste> visiteSpecialistes) {
		super();
		this.specialite = specialite;
		this.tarifHonoraires = tarifHonoraires;
		this.visiteSpecialistes = visiteSpecialistes;
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

	public List<VisiteSpecialiste> getVisiteSpecialistes() {
		return visiteSpecialistes;
	}

	public void setVisiteSpecialistes(List<VisiteSpecialiste> visiteSpecialistes) {
		this.visiteSpecialistes = visiteSpecialistes;
	}
	
}
